package com.flighmanapp.flightmanagementapp.service;

import com.flighmanapp.flightmanagementapp.model.Flight;
import com.flighmanapp.flightmanagementapp.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImp implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public void removeFlight(Long id) {
        flightRepository.deleteById(id);
    }

    @Override
    public Flight updateFlight(Long id, Flight flight) {
        flight.setId(id);
        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElseThrow(() -> new RuntimeException("Flight not found"));
    }
}