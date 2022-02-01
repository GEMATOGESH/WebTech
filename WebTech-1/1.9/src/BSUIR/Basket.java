package BSUIR;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<Ball>();

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int getBasketWeight() {
        int weight = 0;
        for (int i = 0; i < balls.size(); i++) {
            weight += balls.get(i).getWeight();
        }
        return weight;
    }

    public int getNumOfBlueBalls() {
        int num = 0;
        for (int i = 0; i < balls.size(); i++) {
            if (balls.get(i).getColor() == "blue") {
                num++;
            }
        }
        return num;
    }
}
