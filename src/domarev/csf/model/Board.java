package domarev.csf.model;

public class Board {

    private final Checker[][] board = new Checker[8][8];
    private boolean isEmpty;

    public Board() {
    }

    public Checker[][] getBoard() {
        return board;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
