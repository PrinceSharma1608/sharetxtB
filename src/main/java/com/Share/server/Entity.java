package com.Share.server;
import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
@Table("transfer")
public class Entity {
    @Getter
    @Setter
    @Column("transfertext")
    String text;
    @Getter
    @Setter
    @Column("id")
    @Id
    String Code;
}

