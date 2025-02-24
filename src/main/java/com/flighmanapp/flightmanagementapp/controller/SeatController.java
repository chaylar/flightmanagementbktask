package com.flighmanapp.flightmanagementapp.controller;

import com.flighmanapp.flightmanagementapp.model.Seat;
import com.flighmanapp.flightmanagementapp.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @PostMapping("/addseat")
    public ResponseEntity<Seat> addSeat(@RequestBody Seat seat) {
        Seat savedSeat = seatService.addSeat(seat);
        return ResponseEntity.ok(savedSeat);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeSeat(@PathVariable Long id) {
        seatService.removeSeat(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Seat> updateSeat(@PathVariable Long id, @RequestBody Seat seat) {
        Seat updatedSeat = seatService.updateSeat(id, seat);
        return ResponseEntity.ok(updatedSeat);
    }

    @GetMapping("/flight/{flightId}")
    public ResponseEntity<List<Seat>> getSeatsByFlight(@PathVariable Long flightId) {
        List<Seat> seats = seatService.getSeatsByFlight(flightId);
        return ResponseEntity.ok(seats);
    }

    @PostMapping("/{seatId}/purchase")
    public ResponseEntity<String> purchaseSeat(@PathVariable Long seatId) {
        boolean success = seatService.purchaseSeat(seatId);
        if (success) {
            return ResponseEntity.ok("Seat purchased successfully!");
        } else {
            return ResponseEntity.badRequest().body("Seat is already booked.");
        }
    }
}
