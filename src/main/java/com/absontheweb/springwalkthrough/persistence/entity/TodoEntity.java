package com.absontheweb.springwalkthrough.persistence.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.absontheweb.springwalkthrough.model.Status;
import com.absontheweb.springwalkthrough.model.TodoType;


@Entity
@Table(name="todo")
public class TodoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, name="id")
	private Long id;
	
	@Column(nullable=false, length=255)
	private String name;
	
	@Enumerated
	@Column(nullable=false)
	private Status status;
	
	@Enumerated
	@Column(nullable=false)
	private TodoType type;
	
	@Column(name="creation_date")
	private LocalDateTime creationDate;
	
	@Column(name="due_date")
	private LocalDateTime dueDate;

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
	
	
	
}
