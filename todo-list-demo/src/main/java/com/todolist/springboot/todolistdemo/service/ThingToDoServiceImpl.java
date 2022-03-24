package com.todolist.springboot.todolistdemo.service;

import java.util.List;
import java.util.Optional;

import com.todolist.springboot.todolistdemo.dao.ThingsToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.springboot.todolistdemo.entity.ThingsToDo;

@Service
public class ThingToDoServiceImpl implements ThingsToDoService {

	private ThingsToDoRepository thingsToDoRepository;
	
	@Autowired
	public ThingToDoServiceImpl(ThingsToDoRepository theThingsToDoRepository) {

		thingsToDoRepository = theThingsToDoRepository;
	}
	
	@Override
	public List<ThingsToDo> findAll() {
		// TODO Auto-generated method stub
		return thingsToDoRepository.findAll();
	}

	@Override
	public ThingsToDo findById(int theId) {
		// TODO Auto-generated method stub
		Optional<ThingsToDo> result = thingsToDoRepository.findById(theId);

		ThingsToDo theThingsToDo = null;
		if (result.isPresent()) {
			theThingsToDo = result.get();
		} else {
			throw new RuntimeException("Did not find id - " + theId);
		}
		return theThingsToDo;
	}

	@Override
	public void save(ThingsToDo theThingsToDo) {
		thingsToDoRepository.save(theThingsToDo);

	}

	@Override
	public void deleteById(int theId) {
		thingsToDoRepository.deleteById(theId);

	}

}
