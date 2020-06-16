package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.pojos.Topic;

@Service
public class TopicService {
 private List<Topic> topics= new ArrayList<>(Arrays.asList(
			  new Topic("1","Spring","spring framework","spring framework description"),
			  new Topic("2","java","core java","java description"),
			  new Topic("3","Html","html","html description")
			  ));
 
  public List<Topic> getAllTopics()
  {
	  return topics;
  }
  public Topic getTopic(String id)
  {
	  return  topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	  
  }
public void addTopic(Topic topic) {
	topics.add(topic);
	
}
public void updateTopic(String id,Topic topic) {
	for(int i=0; i < topics.size(); i++)
	{
		Topic t=topics.get(i);
		if(t.getId().equals(id))
		{
			topics.set(i, topic);
			//return;
		}
	}
	
}
public void deleteTopic(String id) {
	topics.removeIf(t -> t.getId().equals(id));
}

}
