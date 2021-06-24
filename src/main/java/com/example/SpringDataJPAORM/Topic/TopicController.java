package com.example.SpringDataJPAORM.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @PostMapping("/saveTopic")
    public Topic addTopic(@RequestBody Topic topic){

        return topicService.addTopic(topic);
    }

    @GetMapping("/getTopic/{id}")
    public Topic getTopic(@PathVariable int id){
        return topicService.getTopic(id);
    }


    @GetMapping("/getAllTopics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @PutMapping("/updateTopic/{id}")
    public Topic updateTopic(@PathVariable int id,@RequestBody Topic topic){

        return topicService.updateTopic(id,topic);
    }

    @DeleteMapping("/deleteTopic/{id}")
    public String deleteTopic(@PathVariable int id){

        return topicService.deleteTopic(id);
    }

}
