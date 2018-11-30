package com.swarm.api.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController @RequestMapping("/nodes")
public class NodeController {
    @Autowired
    private NodeRepository nodeRepo;

    @GetMapping
    public Iterable<Node> getAllNodes(){
        return nodeRepo.findAll();
    }

    @PostMapping("/node")
    public Node createNode(@RequestBody Map<String, String> payload) {
        return nodeRepo.save(new Node(payload));
    }

    @DeleteMapping("/node")
    public void deleteNode(@RequestParam(required = true) Long id) {
        nodeRepo.deleteById(id);
    }

}
