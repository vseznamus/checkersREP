package domarev.csf.view;

import domarev.csf.model.Coordinates;
import domarev.csf.service.Logic;
import domarev.csf.service.exceptions.CheckerNotFoundException;
import domarev.csf.service.exceptions.ImpossibleMoveException;
import domarev.csf.service.exceptions.OccupiedCoordinateException;

import java.util.Scanner;

public class MainView {

    Logic logic = new Logic();

    public void start() throws OccupiedCoordinateException, CheckerNotFoundException, ImpossibleMoveException {
        Scanner scanner = new Scanner(System.in);
        logic.refresh();
        System.out.println("WHITE TEAM BUILT AND READY");
        System.out.println("BLACK TEAM BUILT AND READY");
        System.out.println("RULES :" +
                " TEMPLATE FOR PLAYING : (*coordinate*) - ENTER - (*second coordinate to put checker*)");

        String command;
        String[] scStrings;

        do {
            System.out.println("ENTER COMMAND : ");
            command = scanner.nextLine();
            logic.move(Coordinates.E6, Coordinates.F5);
    } while (logic.gameEnds());
    }
}
