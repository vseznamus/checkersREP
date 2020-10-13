package domarev.csf.model;

import domarev.csf.service.exceptions.ImpossibleMoveException;

public class Checker implements IChecker {

    public final Color color;
    private final Points position;

    public Checker(final Points position, Color color) {
        this.position = position;
        this.color = color;
    }

    @Override
    public Points pos() {
        return this.position;
    }

    @Override
    public Points[] way(Points des) throws ImpossibleMoveException {
        return new Points[]{
                des
        };
    }

    @Override
    public Checker clone(Points des) {
        return new Checker(des, color);
    }
}
