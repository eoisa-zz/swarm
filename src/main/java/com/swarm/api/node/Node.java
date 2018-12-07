package com.swarm.api.node;

import com.vividsolutions.jts.geom.Geometry;
import lombok.Data;

import javax.persistence.*;
import java.util.Map;

@Data
@Entity
@Table(name = "nodes")
public class Node {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    Long id;

    @Column
    private String name;

    @Column
    private Long hive;

    @Column
    private Geometry destination;

    Node(ProtoNode payload) {
        this.name = payload.name.orElse(null);
        this.hive = payload.hive;
    }

    String extractName(){
        return name;
    }

    long extractHiveId(){
        return hive;
    }

    GeoCoordinates extractDestination(){
        return new GeoCoordinates(destination.getCoordinate().x, destination.getCoordinate().y);
    }
}
