package com.flighmanapp.flightmanagementapp.service;

import com.flighmanapp.flightmanagementapp.model.Passenger;
import com.flighmanapp.flightmanagementapp.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImp implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public void removePassenger(Long id) {
        passengerRepository.deleteById(id);
    }

    @Override
    public Passenger updatePassenger(Long id, Passenger passenger) {
        passenger.setId(id);
        return passengerRepository.save(passenger);
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    @Override
    public Passenger getPassengerById(Long id) {
        return passengerRepository.findById(id).orElseThrow(() -> new RuntimeException("Passenger not found"));
    }
}