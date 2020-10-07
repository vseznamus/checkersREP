package domarev.csf.model;

public class BlackChecker implements Checker {

    private final Coordinates position;

    public BlackChecker(final Coordinates position) {
        this.position = position;
    }

    @Override
    public Coordinates pos() {
        return this.position    ;
    }

    @Override
    public Coordinates[] way(Coordinates des) {
        return new Coordinates[0];
    }

    @Override
    public Checker clone(Coordinates des) {
        return null;
    }
}
