package com.swarm.api.node;

import lombok.Data;

import java.util.Optional;

@Data
public class ProtoNode {
    Optional<String> name;
    long hive;
}
