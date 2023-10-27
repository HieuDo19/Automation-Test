package lab_10;

import java.util.Arrays;

public class TestRacingController {
    public static void main(String[] args) {
        Animal winner = RacingController.getwinner(Arrays.asList(new Dog(), new Horse(), new Tiger()));
        System.out.printf("Winner is %s with %d", winner.getName(), winner.getSpeed());
    }
}
