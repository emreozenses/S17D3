package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.exceptions.KangarooValidation;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/workintech")
public class KangarooController {

    Map<Long, Kangaroo> kangaroos;

    @PostConstruct
    public void init(){
        kangaroos = new HashMap<>();
    }

    public KangarooController(Map<Long, Kangaroo> kangaroos) {
        this.kangaroos = kangaroos;
    }
    @GetMapping("/kangaroos")
    public List<Kangaroo> findAll(){

        return kangaroos.values().stream().toList();
    }

    @GetMapping("/kangaroos/{id}")
    public Kangaroo findById(@PathVariable long id){
        KangarooValidation.isIdNotValid(id);
        return kangaroos.get(id);

    }

    @PostMapping("/")
    public Kangaroo save(@RequestBody Kangaroo kangaroo){

    kangaroos.put(kangaroo.getId(), kangaroo);
    return kangaroos.get(kangaroo.getId());

    }

    @PutMapping("/kangaroos/{id}")
    public Kangaroo update(@PathVariable long id,@RequestBody Kangaroo kangaroo){

        KangarooValidation.isIdNotValid(id);
        kangaroos.put(id,kangaroo);
        return kangaroos.get(kangaroo.getId());

    }
    @DeleteMapping("/developers/{id}")
    public Kangaroo delete(@PathVariable long id){
        KangarooValidation.isIdNotValid(id);
        Kangaroo removedKangaroo = kangaroos.remove(id);
        return removedKangaroo;
    }





}
