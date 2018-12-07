package com.swarm.api.hive;

import com.swarm.api.node.Node;
import com.swarm.api.node.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hives")
public class HiveController {
    @Autowired
    private HiveRepository hiveRepo;

    @Autowired
    NodeRepository nodeRepo;

    @PostMapping
    public Hive createHive(@RequestBody ProtoHive body) {
        return hiveRepo.save(new Hive(body.name));
    }

    @GetMapping("/hive/{hiveId}/nodes")
    public List<Node> getNodesByHive(@PathVariable(value = "hiveId") Long hiveId) {
        return nodeRepo.findByHive(hiveId);
    }

    @PutMapping("/hive/{hiveId}/nodes/node/{nodeId}")
    public List<Node> removeNodeFromHive(@PathVariable(value = "hiveId") Long hiveId, @PathVariable(value = "nodeId") long nodeId) {
        nodeRepo.updateNodeHiveDesignation(nodeId, 0);
        return nodeRepo.findByHive(hiveId);
    }
}
