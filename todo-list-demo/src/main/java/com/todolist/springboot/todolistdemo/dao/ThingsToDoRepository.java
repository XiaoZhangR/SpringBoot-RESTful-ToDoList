package com.todolist.springboot.todolistdemo.dao;

import com.todolist.springboot.todolistdemo.entity.ThingsToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingsToDoRepository extends JpaRepository<ThingsToDo, Integer> {

}
