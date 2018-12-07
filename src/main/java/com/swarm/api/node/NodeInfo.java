package com.swarm.api.node;

import lombok.Data;

@Data
class NodeInfo {
    private long nodeId;
    private long hiveId;
    private String name;
    private float health;
    private GeoCoordinates currentCoordinates;
    private GeoCoordinates destination;

    NodeInfo(long nodeId, long hiveId, String name, float health, GeoCoordinates currentCoordinates, GeoCoordinates destination) {
        this.nodeId = nodeId;
        this.hiveId = hiveId;
        this.name = name;
        this.health = health;
        this.currentCoordinates = currentCoordinates;
        this.destination = destination;
    }
}
