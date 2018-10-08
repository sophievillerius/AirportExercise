package com.capgemini.AirportExercise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String planeIdentification;
    private boolean isCurrentlyFlying;
    private double cruiseSpeed;
    //final int for kerosine capacity because this number is the same for all airplanes and should not change. I make this a double so that I can later add it up with double values
    private final double keroseneCapacity = 5;
    private double amountOfKerosene;

    public Airplane() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString() {
        String planeString = "Plane number " + this.planeIdentification;
        return planeString;
    }

    public void takeOff() {
        if (isCurrentlyFlying) {
            System.out.println(this.planeIdentification + " cannot take off, because we are already flying.");
        }
        else {
            isCurrentlyFlying = true;
            System.out.println("Airplane " + this.planeIdentification + " takes off.");
        }
    }

    public void land() {
        if (!isCurrentlyFlying) {
            System.out.println(this.planeIdentification + " cannot land, because we are still on the ground.");
        }
        else {
            this.isCurrentlyFlying = false;
            System.out.println("Airplane " + this.planeIdentification + " lands.");
        }
    }

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public void setPlaneIdentification(String planeIdentification) {
        this.planeIdentification = planeIdentification;
    }

    public boolean isCurrentlyFlying() {
        return isCurrentlyFlying;
    }

    public void setCurrentlyFlying(boolean currentlyFlying) {
        isCurrentlyFlying = currentlyFlying;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(double cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public double getAmountOfKerosene() {
        return amountOfKerosene;
    }

    public void setAmountOfKerosene(double amountOfKerosene) {
        this.amountOfKerosene = amountOfKerosene;
    }
}
