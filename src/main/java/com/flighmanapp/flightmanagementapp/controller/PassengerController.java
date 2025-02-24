package com.flighmanapp.flightmanagementapp.controller;

import com.flighmanapp.flightmanagementapp.model.Passenger;
import com.flighmanapp.flightmanagementapp.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/addpassenger")
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
        Passenger savedPassenger = passengerService.addPassenger(passenger);
        return ResponseEntity.ok(savedPassenger);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removePassenger(@PathVariable Long id) {
        passengerService.removePassenger(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Passenger> updatePassenger(@PathVariable Long id, @RequestBody Passenger passenger) {
        Passenger updatedPassenger = passengerService.updatePassenger(id, passenger);
        return ResponseEntity.ok(updatedPassenger);
    }

    @GetMapping("/getallpassengers")
    public ResponseEntity<List<Passenger>> getAllPassengers() {
        List<Passenger> passengers = passengerService.getAllPassengers();
        return ResponseEntity.ok(passengers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable Long id) {
        Passenger passenger = passengerService.getPassengerById(id);
        return ResponseEntity.ok(passenger);
    }
}
