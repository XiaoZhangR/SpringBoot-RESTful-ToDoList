package com.todolist.springboot.todolistdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ThingsToDo")
public class ThingsToDo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="item")
	private String item;
	
	@Column(name="status")
	private boolean status;
	
	public ThingsToDo() {
		
	}

	public ThingsToDo(String item, boolean status) {
		this.item = item;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	//define tostring
	@Override
	public String toString() {
		return "ThingsToDo [id=" + id + ", item=" + item + ", status=" + status + "]";
	}
	

}
