package com.swarm.api.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NodeService {
    @Autowired
    private
    NodeRepository nodeRepo;

    public NodeInfo getNodeInfo(long id) {
        Node node = nodeRepo.findById(id).orElse(null);
        float nodeHealth = getHealth(id);

        if (node != null) {
            return new NodeInfo(
                    node.id,
                    node.extractHiveId(),
                    node.extractName(),
                    nodeHealth,
                    getCurrentGeoCoordinates(id),
                    node.extractDestination()
            );
        }

        //  TODO - make this return an appropriate error
        return null;
    }

    //  TODO - wire up RESTful call when node app is written
    private float getHealth(long id) {
        return 100.00F;
    }

    //  TODO - wire up RESTful call when node app is written
    private GeoCoordinates getCurrentGeoCoordinates(long id) {
        return new GeoCoordinates(100, 100);
    }
}
