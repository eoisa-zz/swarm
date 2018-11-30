package com.swarm.api.hive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController @RequestMapping("/hive")
public class HiveController {
    @Autowired
    private HiveRepository hiveRepo;

    @PostMapping
    public Hive createHive(@RequestBody Map<String, String> body){
        return hiveRepo.save(new Hive(body.get("name")));
    }
}
