package domarev.csf.view;


import domarev.csf.service.exceptions.CheckerNotFoundException;
import domarev.csf.service.exceptions.ImpossibleMoveException;
import domarev.csf.service.exceptions.OccupiedCoordinateException;

class Scratch {

    public static void main(String[] args) throws OccupiedCoordinateException, CheckerNotFoundException, ImpossibleMoveException {
        MainView view = new MainView();
        view.start();
    }
}