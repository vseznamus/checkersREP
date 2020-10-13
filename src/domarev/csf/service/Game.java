package domarev.csf.service;

import domarev.csf.model.*;
import domarev.csf.model.Checker;
import domarev.csf.service.BrainService;
import domarev.csf.service.exceptions.CheckerNotFoundException;
import domarev.csf.service.exceptions.ImpossibleMoveException;
import domarev.csf.service.exceptions.OccupiedCoordinateException;

import java.util.Arrays;

public class Game extends BrainService {

    public void restart() {
        clean();
        buildBlackTeam();
        buildWhiteTeam();
    }

    //TODO: over method

    public boolean over() {
        return true;
    }

}
