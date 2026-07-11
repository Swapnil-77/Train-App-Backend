package com.swapnil.Train.controller;

import com.swapnil.Train.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    private TrainService trainService;
    public TrainController(TrainService trainService)
    {
        this.trainService=trainService;
    }

    @GetMapping
    public List<com.swapnil.Train.enitity.Train> getAllTrains()
    {
        return trainService.getAllTrains();
    }

    @PostMapping
    public com.swapnil.Train.enitity.Train addTrain(@RequestBody com.swapnil.Train.enitity.Train train)
    {
        return trainService.addTrain(train);
    }



}
