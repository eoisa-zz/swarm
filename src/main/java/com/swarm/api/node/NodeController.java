package com.swarm.api.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
public class NodeController {

    @Autowired
    private NodeRepository nodeRepository;

    @PostMapping("node")
    public NodeViewModel add(@RequestParam(required = false) String name) {
        Node node = nodeRepository.save(new Node(name));
        return new NodeViewModel(node.getId(), node.getName().orElse(null));
    }

    @DeleteMapping("node")
    public void remove(@RequestParam Node node) {
        nodeRepository.deleteById(node.getId());
    }

}
