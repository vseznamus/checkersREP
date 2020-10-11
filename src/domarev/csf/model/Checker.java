package domarev.csf.model;

public interface Checker {

    Coordinates pos();

    Coordinates[] way(Coordinates des);

    Checker clone(Coordinates des);

}
