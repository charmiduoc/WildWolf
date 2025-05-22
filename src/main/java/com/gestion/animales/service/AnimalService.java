package com.gestion.animales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.animales.model.Animal;
import com.gestion.animales.repository.AnimalRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    //Listar animales
    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    //Listar animal por id
    public Animal findById(long id){
        return animalRepository.findById(id).get();
    }

    //Guardar Animal
    public Animal save(Animal animal){
        return animalRepository.save(animal);
    }

    //Eliminar animal (por id)
    public void delete(long id){
        animalRepository.deleteById(id);
    }
}
