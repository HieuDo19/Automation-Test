package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {
    protected final int MAX_SPEED = 200;

    @Override
    public void setName() {
        name = "Dog";
    }

    @Override
    public void setSpeed() {
        speed = new SecureRandom().nextInt(MAX_SPEED);
    }

    public Dog() {
        setName();
        setSpeed();
    }
}

