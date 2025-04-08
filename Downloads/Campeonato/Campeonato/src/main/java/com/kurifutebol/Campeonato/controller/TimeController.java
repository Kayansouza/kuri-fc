/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kurifutebol.campeonato.controller;

import com.kurifutebol.campeonato.model.Time;
import com.kurifutebol.campeonato.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/times")
public class TimeController {

    @Autowired
    private TimeRepository timeRepository;

    @GetMapping
    public List<Time> listarTimes() {
        return timeRepository.findAll();
    }

    @PostMapping
    public Time salvarTime(@RequestBody Time time) {
        return timeRepository.save(time);
    }
}

