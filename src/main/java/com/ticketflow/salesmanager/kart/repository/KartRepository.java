package com.ticketflow.salesmanager.kart.repository;

import com.ticketflow.salesmanager.kart.model.Kart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KartRepository extends JpaRepository<Kart, Long> {
}