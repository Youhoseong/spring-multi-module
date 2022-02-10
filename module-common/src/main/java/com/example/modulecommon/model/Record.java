package com.example.modulecommon.model;


import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "records")
@NoArgsConstructor
public class Record {

    public Record (Integer minute) {
        this.minute = minute;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer minute;
}
