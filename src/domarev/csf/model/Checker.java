package domarev.csf.model;

public interface Checker {

    Coordinates pos();

    Coordinates[] way(Coordinates des);  //Проверка пути. Параметры - начало и конец - клетка.

    Checker clone(Coordinates des); //используется для перемещения фигуры (перезапись массива).
}
