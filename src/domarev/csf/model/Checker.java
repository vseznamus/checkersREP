package domarev.csf.model;

import domarev.csf.service.exceptions.ImpossibleMoveException;

public class Checker implements IChecker {

    public final Color color;
    private final Point position;

    public Checker(final Point position, Color color) {
        this.position = position;
        this.color = color;
    }

    @Override
    public Point pos() {
        return this.position;
    }

    @Override
    public Point[] way(Point des) throws ImpossibleMoveException {
        return new Point[]{
                des
        };
    }

    @Override
    public Checker clone(Point des) {
        return new Checker(des, color);
    }
}
