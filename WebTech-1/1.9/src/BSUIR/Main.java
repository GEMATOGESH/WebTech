package BSUIR;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Ball ball1 = new Ball(10, "blue");
        basket.addBall(ball1);
        Ball ball2 = new Ball(5, "red");
        basket.addBall(ball2);
        Ball ball3 = new Ball(6, "yellow");
        basket.addBall(ball3);
        Ball ball4 = new Ball(1, "blue");
        basket.addBall(ball4);
        Ball ball5 = new Ball(3, "blue");
        basket.addBall(ball5);
        System.out.println("Basket weight: " + basket.getBasketWeight());
        System.out.println("Number of blue balls in the basket: " + basket.getNumOfBlueBalls());
    }
}
