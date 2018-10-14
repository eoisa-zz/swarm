package com.swarm.api.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class NodeController {

    @Autowired
    private NodeRepository nodeRepository;

    @PostMapping("node")
    public Node add(){
        Node node = nodeRepository.save(new Node());
        return nodeRepository.findById(node.getId()).get();
    }

}
