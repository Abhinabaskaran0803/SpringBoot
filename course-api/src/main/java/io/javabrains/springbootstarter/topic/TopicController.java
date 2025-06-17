//Returning object from controller

package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired                  //Field Injection   (type of an dependency Injection)
	
	private TopicService topicService;//only for creating Business Service
	
	//@RequestMapping("/topics")
	@GetMapping("/topics")                 //getMapping is better than RequestMapping

	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();             //****to print all topics
	}
	
	@RequestMapping("/topics/{foo}")                            //if foo not used we can leave foo as id
	public Topic getTopic(@PathVariable("foo") String id) {           //To shows an particular id here id maps to foo
		return topicService.getTopic(id);                         //****to print single topic
	}
	
//	@RequestMapping("/topics/{id}")                            //same as above
//	public Topic getTopic(@PathVariable String id) {           
//		return topicService.getTopic(id);
//	}
	
	
	//post the data and add in topics
	@RequestMapping(method=RequestMethod.POST , value="/topics")      //(method,value   //Topic-->json rep of topic instance
	public void addTopic(@RequestBody Topic topic) {                         //create resource using post
		  topicService.addTopic(topic);                                                 //RequestBody used to get an data from get
	}                                                        //To edit the post body use  tool "POSTMAN"
	
	//put method for update and delete/*
	@RequestMapping(method=RequestMethod.PUT , value="/topics/{id}")      
	public void updateTopic(@RequestBody Topic topic , @PathVariable String id ) {                         
		  topicService.updateTopic(id,topic);                                                
	}     
	
	@RequestMapping(method=RequestMethod.DELETE , value="/topics/{id}")      
	public void deleteTopic(@PathVariable String id ) {                         
		  topicService.deleteTopic(id);                                                
	}   
}

//run in localhost:8080/topics