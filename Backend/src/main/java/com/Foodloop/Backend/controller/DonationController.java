package com.Foodloop.Backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Foodloop.Backend.entity.Donation;
import com.Foodloop.Backend.entity.DonationStatus;
import com.Foodloop.Backend.repository.DonationRepository; // <-- Ensure this import is present

@RestController
@RequestMapping("/api/donations")
@CrossOrigin(origins = "*")
public class DonationController {

    @Autowired
    private DonationRepository donationRepository;

    @GetMapping
    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    @PostMapping
    public Donation createDonation(@RequestBody Donation donation) {
        return donationRepository.save(donation);
    }

    @PutMapping("/{id}/status")
    public Donation updateStatus(@PathVariable Long id, @RequestParam DonationStatus status) {
        Donation donation = donationRepository.findById(id).get();
        donation.setStatus(status);
        return donationRepository.save(donation);
    }

    @DeleteMapping("/{id}")
    public String deleteDonation(@PathVariable Long id) {
        donationRepository.deleteById(id);
        return "Donation deleted successfully!";
    }
}