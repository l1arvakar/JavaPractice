package by.bsuir;

public class Ball {

    public enum BallColor {
        GREEN, BLUE, YELLOW, RED, WHITE, BLACK
    }
    private int weight;
    private BallColor ballColor;

    public Ball(int weight, BallColor ballColor) {
        this.weight = weight;
        this.ballColor = ballColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BallColor getBallColor() {
        return ballColor;
    }

    public void setBallColor(BallColor ballColor) {
        this.ballColor = ballColor;
    }
}
