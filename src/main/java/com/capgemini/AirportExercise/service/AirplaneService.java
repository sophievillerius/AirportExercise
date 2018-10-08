package com.capgemini.AirportExercise.service;

import com.capgemini.AirportExercise.model.Airplane;

import java.util.ArrayList;

public class AirplaneService {

    private String name;
    private ArrayList<Airplane> airplanes = new ArrayList<>();

    public AirplaneService(String airportName) {
        this.name = airportName;
    }

    public ArrayList<Airplane> getAirplanes() {
        return this.airplanes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    //print a list of all airplanes and their names
    public void printAirplanes() {
        System.out.println("Passenger planes from airport " + this.name + ":");
        for (Airplane i : this.airplanes) {
            System.out.println(i.toString());
        }
    }

}
