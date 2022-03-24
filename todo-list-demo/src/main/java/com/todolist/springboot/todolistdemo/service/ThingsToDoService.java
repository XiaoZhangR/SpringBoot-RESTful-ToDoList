package com.todolist.springboot.todolistdemo.service;

import java.util.List;

import com.todolist.springboot.todolistdemo.entity.ThingsToDo;

public interface ThingsToDoService {
	
	public List<ThingsToDo> findAll();	
	
	public ThingsToDo findById(int theId);
	
	public void save(ThingsToDo theThingsToDo);
	
	public void deleteById(int theId);

}
