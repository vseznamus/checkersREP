package domarev.csf.view;

import domarev.csf.model.Checker;
import domarev.csf.model.Color;
import domarev.csf.model.Point;

import domarev.csf.service.Game;
import domarev.csf.service.exceptions.CheckerNotFoundException;
import domarev.csf.service.exceptions.ImpossibleMoveException;
import domarev.csf.service.exceptions.OccupiedCoordinateException;

import java.util.Scanner;

public class TestView {

    Game game = new Game();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        game.restart();
        System.out.println("WHITE TEAM BUILT AND READY");
        System.out.println("BLACK TEAM BUILT AND READY");
        System.out.println("------> WHITE TEAM BEGINS");
        System.out.println("RULES :" +
                " TEMPLATE FOR PLAYING : (*coordinate*) - ENTER - (*second coordinate to put checker*)");
        String command, command2;
        Color turn = Color.WHITE;

        do {
            System.out.println("ENTER FIRST POINT : ");
            command = scanner.nextLine();
            Point type = Point.valueOf(command.toUpperCase());
            System.out.println("ENTER SECOND POINT : ");
            command2 = scanner.nextLine();
            Point type2 = Point.valueOf(command2.toUpperCase());
            try {
                if (game.getColor(type) == turn) {
                    try {
                        game.move(type, type2);
                        System.out.println("Checker " + type + " moved to " + type2);
                        if (turn == Color.WHITE) {
                            turn = Color.BLACK;
                        } else turn = Color.WHITE;
                        System.out.println("---------------> " + turn + " TURN NOW");
                    } catch (OccupiedCoordinateException e) {
                        System.out.println("!<-Occupied cell found->!");
                    } catch (CheckerNotFoundException e) {
                        System.out.println("!<-Empty cell found->!");
                    } catch (ImpossibleMoveException e) {
                        System.out.println("!<-Checker cannot move this way->!");
                    }
                } else System.out.println("---------------> " + turn + " TURN NOW. -----> TRY AGAIN");
            } catch (CheckerNotFoundException e) {
                e.printStackTrace();
            }
        } while (game.over());
    }
}
