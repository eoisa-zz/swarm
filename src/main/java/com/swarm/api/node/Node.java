package com.swarm.api.node;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "nodes")
class Node {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    private String name;

    Node(String name) {
        this.name = name;
    }

    Long getId() {
        return id;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
