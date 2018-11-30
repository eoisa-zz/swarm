package com.swarm.api.node;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NodeRepository extends CrudRepository<Node, Long> {
    List<Node> findByHive(Long hiveId);
}
