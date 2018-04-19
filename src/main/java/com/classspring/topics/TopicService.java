package com.classspring.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ammy on 4/19/18.
 */

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Java","Beginners","A beginner guide"),
            new Topic("jScript","Novice","Guide to javaScript"),
            new Topic("Earth","flatIt","Proof of flat earth"),
            new Topic("Woman","Know Thrm","Book to understand women")

    ));

    List<Topic> getAllTopics(){

        return topics;
    }

    Topic getTopic(String id){

        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


    void addTopic(Topic topic) {
        topics.add(topic);
    }

    void updateTopic(String id, Topic topic) {
        for (int i=0; i < topics.size(); i++){
            Topic t = topics.get(i);
            if (t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }

        }

    }

    void deleteTopic(String id){
        topics.removeIf(t -> t.getId().equals(id));
    }
}
