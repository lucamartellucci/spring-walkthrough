package com.absontheweb.springwalkthrough.service;

import java.util.Collection;

import com.absontheweb.springwalkthrough.model.Status;
import com.absontheweb.springwalkthrough.model.Todo;

public interface TodoService {

	void addTodo(Todo todo);

	Collection<Todo> getTodos();

	void removeTodo(Long id);

	void updateTodoStatus(Long id, Status status);

	Todo getTodo(Long id);

}
