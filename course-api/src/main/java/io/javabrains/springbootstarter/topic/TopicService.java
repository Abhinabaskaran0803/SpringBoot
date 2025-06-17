//creating Business Service
package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring framework","spring framework Description"),
			new Topic("java","Core Java","Core Java Description"),
			new Topic("javascript","JavaScript","JavaScript Description")
			));                            // by using new ArrayList<> it may mutable and change may takes place in postman
	public List<Topic> getAllTopics(){
		return topics;                    
	}                                             //for printing all id,name and description
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}                                          //to print id of an 1st parameter

	//for post usage add an topic using post method
	public void addTopic(Topic topic) {
	    topics.add(topic);                  //for post in controller
	}                                       //topics la adding new topic using postman tool

	
	//for updating and deleting(PUT Method)
	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}	
} 
