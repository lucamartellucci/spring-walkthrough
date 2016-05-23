package io.lucci.springwalkthrough.model;

import java.time.LocalDateTime;

public class Todo {
	
	private String uuid;
	private String todo;
	private TodoStatus status;
	private LocalDateTime creationDate;
	
	public Todo() {}
	public Todo(String todo) {
		super();
		this.todo = todo;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public TodoStatus getStatus() {
		return status;
	}
	public void setStatus(TodoStatus status) {
		this.status = status;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	
	public boolean isDone() {
		return TodoStatus.done.equals(this.status);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Todo [uuid=");
		builder.append(uuid);
		builder.append(", todo=");
		builder.append(todo);
		builder.append(", status=");
		builder.append(status);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append("]");
		return builder.toString();
	}
	
}
