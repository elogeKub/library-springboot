package com.eloge.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eloge.library.model.Laptop;
import com.eloge.library.repository.LaptopRepository;

@RestController
public class LaptopController {
    @Autowired
    private LaptopRepository laptopRepository;

    @PostMapping("/add_laptop")
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @GetMapping("/all_laptop")
    public List<Laptop> getAllLaptop() {
        return laptopRepository.findAll();
    }

}
