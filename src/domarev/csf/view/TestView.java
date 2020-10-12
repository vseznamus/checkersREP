package domarev.csf.view;

import domarev.csf.model.Checker;
import domarev.csf.model.Color;
import domarev.csf.model.Points;
import domarev.csf.model.IChecker;
import domarev.csf.service.ActionService;
import domarev.csf.service.exceptions.CheckerNotFoundException;
import domarev.csf.service.exceptions.ImpossibleMoveException;
import domarev.csf.service.exceptions.OccupiedCoordinateException;

import java.util.Scanner;

public class TestView {

    ActionService action = new ActionService();

    public void start() {
        //Scanner scanner = new Scanner(System.in);
        action.restart();
        System.out.println("WHITE TEAM BUILT AND READY");
        System.out.println("BLACK TEAM BUILT AND READY");
        //System.out.println("RULES :" +
         //       " TEMPLATE FOR PLAYING : (*coordinate*) - ENTER - (*second coordinate to put checker*)");

       // String command;
        //String[] scStrings;

            //System.out.println("ENTER COMMAND : ");
            //command = scanner.nextLine();

        try {
            //action.move(Points.E6, Points.E5);
            //System.out.println("Checker E6 moved to E5");
            action.move(Points.E6, Points.F5);
            System.out.println("Checker E6 moved to F5");
            action.move(Points.H3, Points.G4);
            System.out.println("Checker H3 moved to G4");
            action.move(Points.F5, Points.H3);
            System.out.println("Checker F5 moved to H3");
        } catch (OccupiedCoordinateException e) {
            System.out.println("Occupied cell found");
        } catch (CheckerNotFoundException e) {
            System.out.println("Empty cell found");
        } catch (ImpossibleMoveException e) {
            System.out.println("Checker cannot move this way");
        }


    }
}
