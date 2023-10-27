package lab_09;

import java.util.List;

public class AnimalController {
    public Animal getWinner(List<Animal> list) {
        Animal winner = null;
        int maxSpeed = -1;
        for (Animal item : list) {
            if (!item.isWithSwing()) {
                int currentSpeed = item.getSpeed();
                if (maxSpeed < currentSpeed) {
                    maxSpeed = currentSpeed;
                    winner = item;
                }
            }
        }
        return winner;
    }
}
