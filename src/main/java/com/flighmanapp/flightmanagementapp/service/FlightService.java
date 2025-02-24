package com.flighmanapp.flightmanagementapp.service;

import com.flighmanapp.flightmanagementapp.model.Flight;
import java.util.List;

public interface FlightService {
    Flight addFlight(Flight flight);
    void removeFlight(Long id);
    Flight updateFlight(Long id, Flight flight);
    List<Flight> getAllFlights();
    Flight getFlightById(Long id);
}
