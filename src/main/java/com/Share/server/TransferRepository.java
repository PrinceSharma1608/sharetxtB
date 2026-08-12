package com.Share.server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransferRepository extends JpaRepository<Entity, String> {
    Optional<Entity> findById(String id);
    void deleteById(String id);
}