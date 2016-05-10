package io.lucci.springwalkthrough.commons.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class Todo {
	
	private Long id;
	private String name;
	private Status status;
	private TodoType type;
	private LocalDateTime creationDate;
	private LocalDateTime dueDate;
	private List<Task> tasks = new ArrayList<>(); 
	
	
	public Todo() {
		this.type = TodoType.SIMPLE;
	}
	
	public Todo(String name) {
		super();
		this.name = name;
		this.type = TodoType.SIMPLE;
	}
	
	public Todo(String name, List<Task> tasks) {
		super();
		this.name = name;
		this.type = TodoType.TASK_LIST;
		this.tasks.addAll(tasks);
	}
	
	public Todo addTask(Task t) {
		this.tasks.add(t);
		return this;
	}
	
	public boolean isDone() {
		return Status.DONE.equals(this.status);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public TodoType getType() {
		return type;
	}

	public void setType(TodoType type) {
		this.type = type;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
}
