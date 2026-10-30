package com.Foodloop.Backend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Foodloop.Backend.entity.Donation;
import com.Foodloop.Backend.entity.DonationStatus;

public interface DonationRepository extends JpaRepository<Donation, Long> {
    List<Donation> findByStatus(DonationStatus status);
}