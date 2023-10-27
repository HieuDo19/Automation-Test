package lab_09;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String name;
    private boolean withSwing;

    protected Animal(Builder builder) {
        this.speed = builder.speed;
        this.name = builder.name;
        this.withSwing = builder.withSwing;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public boolean isWithSwing() {
        return withSwing;
    }

    public static class Builder {
        private int speed;
        private String name;
        private boolean withSwing;

        public Builder setRandomWithMaxSpeed(int maxSpeed) {
            this.speed = new SecureRandom().nextInt(maxSpeed);
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWithSwing(boolean withSwing) {
            this.withSwing = withSwing;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
