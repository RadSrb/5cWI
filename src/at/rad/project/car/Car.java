package at.rad.project.car;

import at.rad.project.car.exceptions.CarException;
import at.rad.project.car.exceptions.EngineException;
import java.util.Random;

public class Car {
    private Engine engine; //Gedächtnisvariable Instanzvariable

    public Car(Engine e) {
        this.engine = e;
    }

    public void startCar() throws EngineException, CarException {
        Random r = new Random();
        engine.start();
        if (r.nextBoolean()) {
            throw new CarException("Car broke!");
        }
    }
}