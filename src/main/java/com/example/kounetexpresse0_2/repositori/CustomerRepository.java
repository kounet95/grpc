package com.example.kounetexpresse0_2.repositori;

import com.example.kounetexpresse0_2.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Clients, Long> {
}
