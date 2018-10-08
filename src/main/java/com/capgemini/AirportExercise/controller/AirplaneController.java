package com.capgemini.AirportExercise.controller;

import com.capgemini.AirportExercise.model.Airplane;
import com.capgemini.AirportExercise.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/airplanes/")
public class AirplaneController {
    @Autowired
    private AirplaneRepository airplaneRepository;

//    @PostConstruct
//    //this method will be called every time the application is started
//    public void addSomeAirplanesToGetStarted() {
//        for(int i = 1; i < 6; i++) {
//            Airplane airplane = new Airplane();
//            airplane.setPlaneIdentification("AF " + i);
//            this.airplaneRepository.save(airplane);
//        }
//    }

    @PostMapping
    public Airplane create(@RequestBody Airplane newAirplane) {
        this.airplaneRepository.save(newAirplane);
        return newAirplane;
    }

    @GetMapping
    public Iterable<Airplane> list() {
        return this.airplaneRepository.findAll();
    }

    @GetMapping("{id}")
    public Airplane findById(@PathVariable long id) {
        Optional<Airplane> result = this.airplaneRepository.findById(id);
        if ((result).isPresent()) {
            return result.get();
        }
        return null;
    }

    @PutMapping("{id}")
    public Airplane updateById(@PathVariable long id, @RequestBody Airplane update) {
        Optional<Airplane> oldAirplane = this.airplaneRepository.findById(id);
        if (oldAirplane.isPresent()) {
            oldAirplane.get().setAmountOfKerosene(update.getAmountOfKerosene());
            oldAirplane.get().setCurrentlyFlying(update.isCurrentlyFlying());
            oldAirplane.get().setPlaneIdentification(update.getPlaneIdentification());
        }
        return this.airplaneRepository.save(oldAirplane.get());
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable long id) {
        this.airplaneRepository.deleteById(id);
    }
}
