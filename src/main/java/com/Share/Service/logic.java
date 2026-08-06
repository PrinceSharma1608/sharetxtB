package com.Share.Service;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.Share.server.Entity;
import com.Share.server.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class logic {

    @Autowired
    private TransferRepository repository;

    public void push(String text) {
        String id = LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));

        Entity entity = new Entity();
        entity.setCode(id);
        entity.setText(text);

        repository.save(entity);
    }
}
