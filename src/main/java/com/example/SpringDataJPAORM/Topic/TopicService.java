package com.example.SpringDataJPAORM.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public Topic addTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public Topic getTopic(int id) {
        return topicRepository.findById(id).orElse(null);
    }

    public List<Topic> getAllTopics() {

        return topicRepository.findAll();
    }

    public Topic updateTopic(int id,Topic topic) {
        return topicRepository.save(topic);

    }

    public String deleteTopic(int id) {

        topicRepository.deleteById(id);
        return id+ " number topic is deleted successfully!!";
    }


}
