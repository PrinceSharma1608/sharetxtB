package com.Share.Service;

import com.Share.server.Entity;
import com.Share.server.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class logic {

    @Autowired
    private TransferRepository repository;

    private static final AtomicInteger counter = new AtomicInteger(1);

    @Transactional
    public String push(String text) {
        String id = LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss")) + counter.getAndIncrement();
        Entity entity = new Entity();
        entity.setCode(String.valueOf(id));
        entity.setText(text);
        entity.setTime(LocalDateTime.now());
        repository.save(entity);
        return id;
    }

    @Transactional
    public String reciever(String id) {
        Optional<Entity> optionalEntity = repository.findById(id);
        if (optionalEntity.isPresent()) {
            Entity entity = optionalEntity.get();
            String text = entity.getText();
            repository.deleteById(id);
            return text;
        } else {
            // Returns HTTP 404 Status when data is not found
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data not found");
        }
    }
}
