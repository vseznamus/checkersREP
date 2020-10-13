package domarev.csf.model;

import domarev.csf.service.exceptions.ImpossibleMoveException;

public interface IChecker {

    Point pos();

    Point[] way(Point des) throws ImpossibleMoveException;

    Checker clone(Point des);
}
