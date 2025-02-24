package com.flighmanapp.flightmanagementapp.repository;

import com.flighmanapp.flightmanagementapp.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
