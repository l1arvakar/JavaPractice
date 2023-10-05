package by.bsuir;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    void addBall(Ball ball) {
        balls.add(ball);
    }

    public int findWeight() {
        int weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int findAmountOfBlue() {
        int counter = 0;
        for (Ball ball : balls) {
            if (ball.getBallColor() == Ball.BallColor.BLUE) {
                counter++;
            }
        }
        return counter;
    }
}
