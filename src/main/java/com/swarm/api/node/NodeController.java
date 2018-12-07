package com.swarm.api.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/nodes")
public class NodeController {
    @Autowired
    private NodeRepository nodeRepo;

    @Autowired
    private NodeService nodeService;

    @GetMapping("/node")
    public NodeInfo getNodeReport(@RequestParam Long id){
        return nodeService.getNodeInfo(id);
    }

    @PostMapping("/node")
    public Node createNode(@RequestBody ProtoNode payload) {
        return nodeRepo.save(new Node(payload));
    }

    @DeleteMapping("/node")
    public void deleteNode(@RequestParam Long id) {
        nodeRepo.deleteById(id);
    }

}
