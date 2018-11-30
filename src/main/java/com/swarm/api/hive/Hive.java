package com.swarm.api.hive;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "hives")
class Hive {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    private String name;

    Hive(String name){
        this.name = name;
    }
}
