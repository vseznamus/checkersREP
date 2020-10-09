package domarev.csf.model;

public class BlackChecker implements Checker {

    private final Coordinates position;

    public BlackChecker(final Coordinates position) {
        this.position = position;
    }

    @Override
    public Coordinates pos() {
        return this.position;
    }

    @Override
    public Coordinates[] way(Coordinates des) {
        throw new IllegalStateException(
                String.format("Could not way by diagonal from %s to %s", position, des)
        );
    }

    @Override
    public Checker clone(Coordinates des) {
        return new BlackChecker(des);
    }

    public boolean isDiagonal(Coordinates start, Coordinates end) {
        return false;
    }
}
