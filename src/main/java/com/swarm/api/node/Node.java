package com.swarm.api.node;

import lombok.Data;

import javax.persistence.*;
import java.util.Map;
import java.util.Optional;

@Data
@Entity
@Table(name = "nodes")
class Node {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    Long id;

    @Column
    private String name;

    private Long hive;

    Node(Map<String, String> payload) {
        this.name = payload.getOrDefault("name", null);
        this.hive = Long.parseLong(payload.get("hive"));
    }
}
