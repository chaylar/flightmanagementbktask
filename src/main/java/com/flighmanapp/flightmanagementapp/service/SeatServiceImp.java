package com.flighmanapp.flightmanagementapp.service;

import com.flighmanapp.flightmanagementapp.model.Seat;
import com.flighmanapp.flightmanagementapp.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImp implements SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public Seat addSeat(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public void removeSeat(Long id) {
        seatRepository.deleteById(id);
    }

    @Override
    public Seat updateSeat(Long id, Seat seat) {
        seat.setId(id);
        return seatRepository.save(seat);
    }

    @Override
    public List<Seat> getSeatsByFlight(Long flightId) {
        return seatRepository.findByFlightId(flightId);
    }

    @Override
    public boolean purchaseSeat(Long seatId) {
        Seat seat = seatRepository.findById(seatId).orElseThrow(() -> new RuntimeException("Seat not found"));
        if (seat.isBooked()) {
            return false; // Seat is already booked
        }
        seat.setBooked(true);
        seatRepository.save(seat);
        return true;
    }
}