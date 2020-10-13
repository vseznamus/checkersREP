package domarev.csf.service;

import domarev.csf.model.Checker;
import domarev.csf.model.Color;
import domarev.csf.model.Point;
import domarev.csf.service.exceptions.CheckerNotFoundException;
import domarev.csf.service.exceptions.ImpossibleMoveException;
import domarev.csf.service.exceptions.OccupiedCoordinateException;

import java.util.Arrays;

public class BrainService {

    private final Checker[] checkers = new Checker[24];
    private int index = 0;

    private void addToArray(Checker checker) {
        this.checkers[this.index++] = checker;
    }

    public void move(Point start, Point end)
            throws CheckerNotFoundException, ImpossibleMoveException, OccupiedCoordinateException {
        int index = findBy(start);
        checkCell(start, end);
        Point[] steps = checkers[index].way(end);
        checkers[index] = checkers[index].clone(end);
    }

    private void checkCell(Point start, Point end) throws ImpossibleMoveException {
        if (end.getX() - start.getX() != Math.abs(1) && end.getY() - start.getY() != Math.abs(1)
                || Math.abs(start.getX() - end.getX()) != Math.abs(start.getY() - end.getY())) {
            throw new ImpossibleMoveException();
        }
    }

    private int findBy(Point point) throws CheckerNotFoundException {
        for (int index = 0; index < checkers.length; index++) {
            Checker checker = checkers[index];
            if (checker != null && checker.pos().equals(point)) {
                return index;
            }
        }
        throw new CheckerNotFoundException();
    }

    protected void clean() {
        Arrays.fill(checkers, null);
        index = 0;
    }

    private void add(Checker checker) {
        addToArray(checker);
    }

    private final int size = 8;

    public Color getColor(Point point) throws CheckerNotFoundException {
        return checkers[findBy(point)].color;
    }

    protected void buildBlackTeam() {
        add(new Checker(Point.B1, Color.BLACK));
        add(new Checker(Point.D1, Color.BLACK));
        add(new Checker(Point.F1, Color.BLACK));
        add(new Checker(Point.H1, Color.BLACK));
        add(new Checker(Point.A2, Color.BLACK));
        add(new Checker(Point.C2, Color.BLACK));
        add(new Checker(Point.E2, Color.BLACK));
        add(new Checker(Point.G2, Color.BLACK));
        add(new Checker(Point.B3, Color.BLACK));
        add(new Checker(Point.D3, Color.BLACK));
        add(new Checker(Point.F3, Color.BLACK));
        add(new Checker(Point.H3, Color.BLACK));
    }

    protected void buildWhiteTeam() {
        add(new Checker(Point.A6, Color.WHITE));
        add(new Checker(Point.C6, Color.WHITE));
        add(new Checker(Point.E6, Color.WHITE));
        add(new Checker(Point.G6, Color.WHITE));
        add(new Checker(Point.B7, Color.WHITE));
        add(new Checker(Point.D7, Color.WHITE));
        add(new Checker(Point.F7, Color.WHITE));
        add(new Checker(Point.H7, Color.WHITE));
        add(new Checker(Point.A8, Color.WHITE));
        add(new Checker(Point.C8, Color.WHITE));
        add(new Checker(Point.E8, Color.WHITE));
        add(new Checker(Point.G8, Color.WHITE));
    }
}
