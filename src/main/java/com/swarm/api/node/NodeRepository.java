package com.swarm.api.node;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface NodeRepository extends JpaRepository<Node, Long> {
    List<Node> findByHive(Long hiveId);

    @Transactional
    @Modifying
    @Query("UPDATE Node n SET n.hive = :hiveDesignation WHERE n.id = :nodeId")
    void updateNodeHiveDesignation(@Param("nodeId") long nodeId, @Param("hiveDesignation") long hiveDesignation);
}
