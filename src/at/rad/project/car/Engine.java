package at.rad.project.car;

import at.rad.project.car.exceptions.EngineException;
import java.util.Random;

public class Engine {
    private int horsePower;

    public Engine(int hp) {
        this.horsePower = hp;
    }

    public void start() throws EngineException {
        Random r = new Random();

        if (r.nextBoolean()) {
            System.out.println("Starting Engine...");
        } else {
            throw new EngineException("Engine start failed");
        }
    }
}