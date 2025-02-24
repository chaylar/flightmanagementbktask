package com.flighmanapp.flightmanagementapp.repository;

import com.flighmanapp.flightmanagementapp.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
