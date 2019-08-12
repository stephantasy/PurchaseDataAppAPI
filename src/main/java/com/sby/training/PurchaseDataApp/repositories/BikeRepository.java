package com.sby.training.PurchaseDataApp.repositories;

import com.sby.training.PurchaseDataApp.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
