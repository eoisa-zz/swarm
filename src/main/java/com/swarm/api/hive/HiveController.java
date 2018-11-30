package com.swarm.api.hive;

import com.swarm.api.node.Node;
import com.swarm.api.node.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController @RequestMapping("/hives")
public class HiveController {
    @Autowired
    private HiveRepository hiveRepo;

    @Autowired
    NodeRepository nodeRepo;

    @PostMapping
    public Hive createHive(@RequestBody Map<String, String> body){
        return hiveRepo.save(new Hive(body.get("name")));
    }

    @GetMapping("/hive/{id}/nodes")
    public List<Node> getNodesByHive(@PathVariable(value = "id") Long id){
        return nodeRepo.findByHive(id);
    }
}
