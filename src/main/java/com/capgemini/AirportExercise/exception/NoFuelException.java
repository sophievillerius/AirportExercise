package com.capgemini.AirportExercise.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Not enough fuel")
public class NoFuelException extends RuntimeException{

}
