package domarev.csf.model;

public interface Checker {

    Coordinates pos();

    Coordinates[] way(Coordinates des);

    Checker clone(Coordinates des);

    default String icon() {
        return String.format(
                "%s.png", getClass().getSimpleName()
        );
    }
}
