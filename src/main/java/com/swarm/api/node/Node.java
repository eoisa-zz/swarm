package com.swarm.api.node;

import javax.persistence.*;

@Entity
@Table(name = "nodes")
class Node {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    Long getId() {
        return id;
    }
}
