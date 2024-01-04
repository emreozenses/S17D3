package com.workintech.zoo.controller;


import com.workintech.zoo.entity.Koala;
import com.workintech.zoo.exceptions.KoalaValidation;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech")
public class KoalaController {

    Map<Long, Koala> koalas;
    @PostConstruct
    public void init(){
        koalas = new HashMap<>();
    }

    public KoalaController(Map<Long, Koala> koalas) {
        this.koalas = koalas;
    }

    @GetMapping("/koalas")
    public List<Koala> findAll(){
        return koalas.values().stream().toList();
    }

    @GetMapping("/koalas/{id}")
    public Koala findById (@PathVariable long id){

        KoalaValidation.isIdNotValid(id);
        //TODO [Emre] check id.it must be greater than 0

        KoalaValidation.isKoalaNotExist(koalas,id);
        //TODO [Emre] check is id in map or not

        return koalas.get(id);
    }

    @PostMapping("/koalas")
    public Koala save(@RequestBody Koala koala){
        Koala savedKoala = koalas.put(koala.getId(),koala);
        return savedKoala;
    }
    @PutMapping("/koalas/{id}")
    public Koala update(@PathVariable long id,@RequestBody Koala koala){

        KoalaValidation.isKoalaNotExist(koalas,id);
        KoalaValidation.isIdNotValid(id);
        Koala updatedKoala = koalas.put(id,koala);
        return updatedKoala;
    }

    @DeleteMapping("/koalas/{id}")
    public Koala delete(@PathVariable long id ){

        KoalaValidation.isKoalaNotExist(koalas,id);
        KoalaValidation.isIdNotValid(id);
        Koala deletedKoala = koalas.remove(id);
        return deletedKoala;
    }



}
