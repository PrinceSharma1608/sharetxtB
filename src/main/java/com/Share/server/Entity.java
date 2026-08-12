package com.Share.server;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@jakarta.persistence.Entity
@Table(name = "transfer")
public class Entity {

    @Id
    @Column(name = "id")
    private String Code;

    @Column(name = "transfertext")
    private String text;

    @Column(name = "time")
    private LocalDateTime time;
}
