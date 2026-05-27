package com.example.network_nodes_demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nodes")
public class NodeController {

    private final NodeService service;

    public NodeController(NodeService service){
        this.service = service;
    }

    @GetMapping
    public List<Node> getAllNodes(){
        return  service.getAllNodes();
    }

    @GetMapping("/{id}")
    public Node getNodeById(@PathVariable Long id){
        return service.getNodeById(id);
    }

    @PostMapping
    public Node addNode(@RequestBody Node node){
        return service.addNode(node);
    }
}
