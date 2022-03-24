package com.todolist.springboot.todolistdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.springboot.todolistdemo.entity.ThingsToDo;
import com.todolist.springboot.todolistdemo.service.ThingsToDoService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ThingsToDoRestController {
	
	private ThingsToDoService thingsToDoService;
	
	@Autowired
	public ThingsToDoRestController(ThingsToDoService theThingsToDoService) {
		thingsToDoService = theThingsToDoService;
	}
	
	@GetMapping("/thingstodo")
	public List<ThingsToDo> findAll() {
		return thingsToDoService.findAll();
	}
	
	@GetMapping("/thingstodo/{thingstodoId}") 
	public ThingsToDo getThingsToDo(@PathVariable int thingstodoId) {
		
		ThingsToDo theThingsToDo = thingsToDoService.findById(thingstodoId);
		
		if (theThingsToDo == null) {
			throw new RuntimeException("thingstodoId not found - " + thingstodoId);
		}
		
		return theThingsToDo;
	}
	
	@PostMapping("/thingstodo") 
	public ThingsToDo addThingsToDo(@RequestBody ThingsToDo theThingstodo) {
		
		theThingstodo.setId(0);
		
		thingsToDoService.save(theThingstodo);
		
		return theThingstodo;
	}
	
	@PutMapping("/thingstodo") 
	public ThingsToDo updateThingsToDo(@RequestBody ThingsToDo theThingstodo) {
		
		thingsToDoService.save(theThingstodo);
		
		return theThingstodo;
	}
	
	@DeleteMapping("/thingstodo/{thingstodoId}")
	public String DeleteThingsToDo(@PathVariable int thingstodoId) {
		
		ThingsToDo theThingsToDo = thingsToDoService.findById(thingstodoId);
		
		if (theThingsToDo == null) {
			throw new RuntimeException("thingstodoId not found - " + thingstodoId);
		}
		
		thingsToDoService.deleteById(thingstodoId);
		
		return "Deleted thingstodoId id - " + thingstodoId;
	}
	
	
	
	
	

}
