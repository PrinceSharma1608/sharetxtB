package com.Share.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransferRepository extends CrudRepository<Entity, String> {

    Optional<Entity> findById(String id);

    void deleteById(String id);
}