package com.javarush.task.task36.task3609;

public class CarController {
    private CarModel model;
    private SpeedometerView view;

    public CarController(CarModel model, SpeedometerView view) {
        this.model = model;
        this.view = view;
    }

    public void speedUp(int seconds) {
        if (getCarSpeed() < getCarMaxSpeed()) {
            int speed = getCarSpeed();
            speed += (3.5 * seconds);
            setCarSpeed(speed);
        }
        if (getCarSpeed() > getCarMaxSpeed()) {
            int speed = getCarMaxSpeed();
            setCarSpeed(speed);
        }
    }

    public void speedDown(int seconds) {
        if (getCarSpeed() > 0) {
            int speed = getCarSpeed();
            speed -= (12 * seconds);
            setCarSpeed(speed);
        }
        if (getCarSpeed() < 0) {
            setCarSpeed(0);
        }
    }
    public String getCarBrand() {
        return model.getBrand();
    }

    public String getCarModel() {
        return model.getModel();
    }

    public void setCarSpeed(int speed) {
        model.setSpeed(speed);
    }

    public int getCarSpeed() {
        return model.getSpeed();
    }

    public int getCarMaxSpeed() {
        return model.getMaxSpeed();
    }

    public void updateView() {
        view.printCarDetails(getCarBrand(), getCarModel(), getCarSpeed());
    }
}