package com.Share.Service;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.Share.server.Entity;
import com.Share.server.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class logic {
    private TransferRepository repo;
    @Autowired
    private TransferRepository repository;

    public String push(String text)
    {
        String id = LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
        int c = 1;
        String r = String.valueOf(c)+id;
        Entity entity = new Entity();
        entity.setCode(r);
        entity.setText(text);

        repository.save(entity);
        return r;
    }
   public String reciever(String id)
   {
       Entity entity = new Entity();
       entity ans= repo.findById(id) ;
       return entity.getText().toString();
       repo.deleteById(id);
   }

}
