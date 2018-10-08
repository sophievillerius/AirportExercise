package com.capgemini.AirportExercise.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DestinationAirport {
    AMSTERDAM, LODNON, PARIS, STOCKHOLM, BERLIN;

    @JsonValue
    public int toValue() {
        return ordinal();
    }
}
