package domarev.csf.model;

import domarev.csf.service.exceptions.ImpossibleMoveException;

public interface IChecker {

    Points pos();

    Points[] way(Points des) throws ImpossibleMoveException;

    Checker clone(Points des);
}
