package com.jota.sanfelipe.repository;

import com.jota.sanfelipe.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByName(String name);
}
