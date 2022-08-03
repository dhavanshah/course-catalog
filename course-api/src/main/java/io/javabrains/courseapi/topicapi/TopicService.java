package io.javabrains.courseapi.topicapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","Spring Framework","Spring Framework Description"),
            new Topic("java","Core Java","Core Java Description"),
            new Topic("javascript","Javascriptk","Javascript Description")
            ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        for (Topic t : topics) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {

        for(Topic t: topics){
            if(t.getId().equals(id)) {
                topics.set(topics.indexOf(t), topic);
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
