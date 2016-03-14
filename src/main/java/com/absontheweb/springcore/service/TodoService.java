package com.absontheweb.springcore.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.absontheweb.springcore.model.Todo;
import com.absontheweb.springcore.model.TodoStatus;

@Service
public class TodoService {

	// todo registry
	private Map<String,Todo> todos = new HashMap<>();
	
	public TodoService(){
		// TODO: to be removed
		this.addTodo(new Todo("pay the plumber"));
		this.addTodo(new Todo("buy the milk"));
	}
	
	public void addTodo(Todo todo){
		String uuid = UUID.randomUUID().toString();
		todo.setUuid(uuid);
		todo.setStatus(TodoStatus.active);
		todo.setCreationDate(LocalDateTime.now());
		this.todos.put(uuid, todo);
	}
	
	public Todo getTodo(String uuid) {
		return todos.get(uuid);
	}
	
	public void updateTodoStatus(String uuid, TodoStatus status) {
		this.todos.get(uuid).setStatus(status);
	}
	
	public void removeTodo(String uuid) {
		this.todos.remove(uuid);
	}
	
	public Collection<Todo> getTodos(){
		return this.todos.values(); 
	}

}
