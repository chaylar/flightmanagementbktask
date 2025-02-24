package com.flighmanapp.flightmanagementapp.service;

import com.flighmanapp.flightmanagementapp.model.Passenger;
import java.util.List;

public interface PassengerService {
    Passenger addPassenger(Passenger passenger);
    void removePassenger(Long id);
    Passenger updatePassenger(Long id, Passenger passenger);
    List<Passenger> getAllPassengers();
    Passenger getPassengerById(Long id);
}
