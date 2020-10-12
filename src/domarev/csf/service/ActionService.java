package domarev.csf.service;

import domarev.csf.model.*;
import domarev.csf.model.Checker;
import domarev.csf.model.Checker;
import domarev.csf.service.exceptions.CheckerNotFoundException;
import domarev.csf.service.exceptions.ImpossibleMoveException;
import domarev.csf.service.exceptions.OccupiedCoordinateException;

import java.util.Arrays;

public class ActionService {
    private final Checker[] checkers = new Checker[24];
    private int index = 0;

    public void addToArray(Checker checker) {
        this.checkers[this.index++] = checker;
    }

    public void move(Points start, Points end)
            throws CheckerNotFoundException, ImpossibleMoveException, OccupiedCoordinateException {
        int index = findBy(start);
        if (end.getX() - start.getX() != Math.abs(1) && end.getY() - start.getY() != Math.abs(1)
                || Math.abs(start.getX() - end.getX()) != Math.abs(start.getY() - end.getY()))
            throw new ImpossibleMoveException();
        Points[] steps = checkers[index].way(end);
        checkers[index] = checkers[index].clone(end);
    }

    private int findBy(Points Points) throws CheckerNotFoundException {
        for (int index = 0; index < checkers.length; index++) {
            Checker checker = checkers[index];
            if (checker != null && checker.pos().equals(Points)) {
                return index;
            }
        }
        throw new CheckerNotFoundException();
    }

    public void clean() {
        Arrays.fill(checkers, null);
        index = 0;
    }

    private final int size = 8;

    public void add(Checker checker) {
        addToArray(checker);
    }

    public void buildBlackTeam() {
        add(new Checker(Points.B1, Color.BLACK));
        add(new Checker(Points.D1, Color.BLACK));
        add(new Checker(Points.F1, Color.BLACK));
        add(new Checker(Points.H1, Color.BLACK));
        add(new Checker(Points.A2, Color.BLACK));
        add(new Checker(Points.C2, Color.BLACK));
        add(new Checker(Points.E2, Color.BLACK));
        add(new Checker(Points.G2, Color.BLACK));
        add(new Checker(Points.B3, Color.BLACK));
        add(new Checker(Points.D3, Color.BLACK));
        add(new Checker(Points.F3, Color.BLACK));
        add(new Checker(Points.H3, Color.BLACK));
    }

    public void buildWhiteTeam() {
        add(new Checker(Points.A6, Color.WHITE));
        add(new Checker(Points.C6, Color.WHITE));
        add(new Checker(Points.E6, Color.WHITE));
        add(new Checker(Points.G6, Color.WHITE));
        add(new Checker(Points.B7, Color.WHITE));
        add(new Checker(Points.D7, Color.WHITE));
        add(new Checker(Points.F7, Color.WHITE));
        add(new Checker(Points.H7, Color.WHITE));
        add(new Checker(Points.A8, Color.WHITE));
        add(new Checker(Points.C8, Color.WHITE));
        add(new Checker(Points.E8, Color.WHITE));
        add(new Checker(Points.G8, Color.WHITE));
    }

    public void restart() {
        clean();
        buildBlackTeam();
        buildWhiteTeam();
    }
}
