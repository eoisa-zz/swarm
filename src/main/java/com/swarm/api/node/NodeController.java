package com.swarm.api.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController @RequestMapping("/node")
public class NodeController {
    @Autowired
    private NodeRepository nodeRepo;

    @PostMapping
    public Node createNode(@RequestBody Map<String, String> payload) {
        return nodeRepo.save(new Node(payload));
    }

    @DeleteMapping
    public void deleteNode(@RequestBody Node node) {
        nodeRepo.deleteById(node.id);
    }

}
