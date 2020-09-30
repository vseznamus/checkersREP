package domarev.csf.service;

import domarev.csf.model.Checker;

public class Logic {
    private final Checker[] checkers = new Checker[24];
    private int index = 0;

    public void add(Checker checker) {
        this.checkers[this.index++] = checker;
    }
}
