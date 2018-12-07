package com.swarm.api.node;

import lombok.Data;

@Data
public class GeoCoordinates {
    double latitude;
    double longetude;

    GeoCoordinates(double lat, double longe){
        this.latitude = lat;
        this.longetude = longe;
    }
}
