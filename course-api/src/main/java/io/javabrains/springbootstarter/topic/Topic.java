//Return object from controller topicController.java
package io.javabrains.springbootstarter.topic;

public class Topic {
	private String id;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;                  //constructor Injection   (type of an dependency Injection)
		this.description = description;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {              //setter Injection  (type of an dependency Injection)
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
