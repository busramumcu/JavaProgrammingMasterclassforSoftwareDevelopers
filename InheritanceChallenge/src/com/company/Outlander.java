package com.company;

public class Outlander extends Car {

    private int roadServiceonths;

    public Outlander(int roadServiceonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceonths = roadServiceonths;
    }

    public void accelarate (int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
        } else if  (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if  (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if  (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0 ) {
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
