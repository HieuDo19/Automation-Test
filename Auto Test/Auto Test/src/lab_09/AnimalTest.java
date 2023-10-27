package lab_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal.Builder builder = new Animal.Builder();
        Animal horse = builder.setRandomWithMaxSpeed(100).setWithSwing(false).setName("horse").build();
        Animal cheetah = builder.setRandomWithMaxSpeed(120).setWithSwing(false).setName("cheetah").build();
        Animal batMexico = builder.setRandomWithMaxSpeed(97).setWithSwing(true).setName("batMexico").build();
        Animal Pronghorn = builder.setRandomWithMaxSpeed(89).setWithSwing(false).setName("Pronghorn").build();
        Animal Springbok = builder.setRandomWithMaxSpeed(88).setWithSwing(false).setName("Springbok").build();
        Animal BlackBuck = builder.setRandomWithMaxSpeed(80).setWithSwing(false).setName("BlackBuck").build();
        Animal rabbit = builder.setRandomWithMaxSpeed(77).setWithSwing(false).setName("rabbit").build();
        Animal falcon = builder.setRandomWithMaxSpeed(400).setWithSwing(true).setName("falcon").build();

        List animals = new ArrayList(Arrays.asList(horse, cheetah, batMexico, Pronghorn, Springbok, BlackBuck, rabbit, falcon));
        Animal winner = new AnimalController().getWinner(animals);
        System.out.printf("Winner is %s with %d", winner.getName(), winner.getSpeed());
    }
}
