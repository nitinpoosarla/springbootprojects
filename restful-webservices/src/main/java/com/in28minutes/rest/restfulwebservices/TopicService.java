package com.in28minutes.rest.restfulwebservices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicsRepository tr;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","springframework"),
			new Topic("javascript","scriptfw"),
			new Topic("nitin","poosarla")));
	
	public List<Topic> getAllTopics()
	{
		List<Topic> t = new ArrayList<>();
		tr.findAll().forEach(t::add);
		return t;
	}

	public Topic getTopic(String id)
	{
		
	return	topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		tr.save(topic);
		//topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {
		
		tr.save(topic);
		/*for (int i=0;i< topics.size();i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
				topics.set(1, topic);
		}
		*/
	}

	public void getDelete(String id) {
		// TODO Auto-generated method stub
		//topics.remove(id);
		tr.deleteById(id);
	}
}
