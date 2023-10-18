package lab_07_2;

import java.util.Arrays;
import java.util.List;

public class TestRacingController {

    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(new Horse(), new Tiger(), new Dog());
        Animal winner = RacingController.getWinner(animalList);
        System.out.println("The winner is: " + winner.getName());
        System.out.println("With the speed: " + winner.getSpeed());
    }

}
