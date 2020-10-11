package domarev.csf.service;

import domarev.csf.model.BlackChecker;
import domarev.csf.model.Checker;
import domarev.csf.model.Coordinates;
import domarev.csf.model.WhiteChecker;
import domarev.csf.service.exceptions.CheckerNotFoundException;
import domarev.csf.service.exceptions.ImpossibleMoveException;
import domarev.csf.service.exceptions.OccupiedCoordinateException;

import java.util.Arrays;

public class Logic {
    private final Checker[] checkers = new Checker[24];
    private int index = 0;

    public void addMassive(Checker checker) {
        this.checkers[this.index++] = checker;
    }

    public void move(Coordinates start, Coordinates end)
            throws CheckerNotFoundException, ImpossibleMoveException, OccupiedCoordinateException {
        int index = findBy(start);
        if (end.getX() - start.getX() != Math.abs(1) && end.getY() - start.getY() != Math.abs(1)
                || Math.abs(start.getX()-end.getX()) != Math.abs(start.getY()-end.getY()))
            throw new ImpossibleMoveException();
        Coordinates[] steps = checkers[index].way(end);
        //free(steps);
        checkers[index] = checkers[index].clone(end);
    }

    private int findBy(Coordinates coordinates) throws CheckerNotFoundException {
        for (int index = 0; index != checkers.length; index++) {
            Checker checker = checkers[index];
            if (checker != null && checker.pos().equals(coordinates)) {
                return index;
            }
        }
        throw new CheckerNotFoundException();
    }

    public void clean() {
        Arrays.fill(checkers, null);
        index = 0;
    }

    /*private boolean free(Coordinates[] steps) throws OccupiedCoordinateException {
        for (int index = 0; index != checkers.length; index++) {
            Checker checker = checkers[index];
            if (checker.pos() != null) {
                throw new OccupiedCoordinateException();
            }
        }
        return true;
    }

     */



    /*public boolean gameEnds() {
        return checkers.length > 12;
    }

     */

    private final int size = 8;

    public void add(Checker checker) {
        addMassive(checker);
        Coordinates position = checker.pos();
    }

    public void buildBlackTeam() {
        add(new BlackChecker(Coordinates.B1));
        add(new BlackChecker(Coordinates.D1));
        add(new BlackChecker(Coordinates.F1));
        add(new BlackChecker(Coordinates.H1));
        add(new BlackChecker(Coordinates.A2));
        add(new BlackChecker(Coordinates.C2));
        add(new BlackChecker(Coordinates.E2));
        add(new BlackChecker(Coordinates.G2));
        add(new BlackChecker(Coordinates.B3));
        add(new BlackChecker(Coordinates.D3));
        add(new BlackChecker(Coordinates.F3));
        add(new BlackChecker(Coordinates.H3));
    }

    public void buildWhiteTeam() {
        add(new WhiteChecker(Coordinates.A6));
        add(new WhiteChecker(Coordinates.C6));
        add(new WhiteChecker(Coordinates.E6));
        add(new WhiteChecker(Coordinates.G6));
        add(new WhiteChecker(Coordinates.B7));
        add(new WhiteChecker(Coordinates.D7));
        add(new WhiteChecker(Coordinates.F7));
        add(new WhiteChecker(Coordinates.H7));
        add(new WhiteChecker(Coordinates.A8));
        add(new WhiteChecker(Coordinates.C8));
        add(new WhiteChecker(Coordinates.E8));
        add(new WhiteChecker(Coordinates.G8));
    }

    public void refresh() {
        clean();
        buildWhiteTeam();
        buildBlackTeam();
    }
}
