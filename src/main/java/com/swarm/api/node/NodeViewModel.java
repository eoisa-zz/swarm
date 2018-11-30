package com.swarm.api.node;

import lombok.Data;

@Data
public class NodeViewModel{
    private long id;
    private String name;

    public NodeViewModel(long id){
        this.id = id;
    }

    public NodeViewModel(long id, String name){
        this.id = id;
        this.name = name;
    }
}
