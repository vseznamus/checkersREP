package domarev.csf.model;

public class WhiteChecker implements Checker {

    private final Coordinates position;

    public WhiteChecker(final Coordinates position) {
        this.position = position;
    }

    @Override
    public Coordinates pos() {
        return this.position;
    }

    @Override
    public Coordinates[] way(Coordinates des) {
        if (!isDiagonal(position,des))
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", position, des)
            );
        else return new Coordinates[] {
                des
        };
    }

    @Override
    public Checker clone(Coordinates des) {
        return new WhiteChecker(des);
    }

    public boolean isDiagonal(Coordinates start, Coordinates end) {
        return false;
    }
}
