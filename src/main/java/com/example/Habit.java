package com.example;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="habits")
public class Habit implements Serializable {
	
private static final long serialVersionUID = -3009157732242241607L;
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;

@Column(name="task")
private String task;

private boolean completed;

protected Habit(){}

public Habit(String task,boolean completed){
	this.task = task;
	this.completed = completed;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTask() {
	return task;
}

public void setTask(String task) {
	this.task = task;
}

public boolean isCompleted() {
	return completed;
}

public void setCompleted(boolean completed) {
	this.completed = completed;
}
	

}
