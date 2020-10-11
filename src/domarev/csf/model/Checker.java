package domarev.csf.model;

import domarev.csf.service.exceptions.ImpossibleMoveException;

public interface Checker {

    Coordinates pos();

    Coordinates[] way(Coordinates des) throws ImpossibleMoveException;

    Checker clone(Coordinates des);

}
