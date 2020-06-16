package com.example.demo.pojos;

public class Topic {
private String id;
private String name;
private String subject;
private String description;
public Topic() {	
}
public Topic(String id, String name, String subject, String description) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
	this.description = description;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
