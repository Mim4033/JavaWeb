package org.example.javaweb.model;

import org.springframework.data.repository.CrudRepository;
import org.example.javaweb.model.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> {


     long countByBreed(String breed);
}

