package domarev.csf.model;

public class Checker_TEST {

    private String color;
    private boolean isQueen;

    public Checker_TEST(String color, boolean isQueen) {
        this.color = color;
        this.isQueen = isQueen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getQueen() {
        return isQueen;
    }

    public void setQueen(boolean queen) {
        isQueen = queen;
    }
}


