package com.flighmanapp.flightmanagementapp.service;

import com.flighmanapp.flightmanagementapp.model.Seat;
import java.util.List;

public interface SeatService {
    Seat addSeat(Seat seat);
    void removeSeat(Long id);
    Seat updateSeat(Long id, Seat seat);
    List<Seat> getSeatsByFlight(Long flightId);
    boolean purchaseSeat(Long seatId);
}