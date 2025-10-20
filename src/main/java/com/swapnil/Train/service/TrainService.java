package com.swapnil.Train.service;

import com.swapnil.Train.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository)
    {
        this.trainRepository=trainRepository;
    }


    public List<com.swapnil.Train.enitity.Train> getAllTrains() {
        return trainRepository.findAll();
    }

    public com.swapnil.Train.enitity.Train addTrain(com.swapnil.Train.enitity.Train train) {
        return trainRepository.save(train);
    }
}
