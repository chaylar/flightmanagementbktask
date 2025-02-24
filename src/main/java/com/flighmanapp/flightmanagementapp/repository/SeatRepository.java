package com.flighmanapp.flightmanagementapp.repository;

import com.flighmanapp.flightmanagementapp.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    Seat findBySeatNumberAndFlightId(String seatNumber, Long flightId);
    List<Seat> findByFlightId(Long flightId);
}
