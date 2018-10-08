package com.capgemini.AirportExercise.repository;

import com.capgemini.AirportExercise.model.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Long> {
}
