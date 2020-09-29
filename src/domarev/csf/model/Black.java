package domarev.csf.model;

public class Black implements Checker {

    private final Coordinates position;

    public Black(final Coordinates position) {
        this.position = position;
    }

    @Override
    public Coordinates pos() {
        return this.position    ;
    }

    @Override
    public Coordinates[] way(Coordinates dep, Coordinates des) {
        Coordinates[] step = new Coordinates[0];
    }

    @Override
    public Checker clone(Coordinates des) {
        return null;
    }
}
