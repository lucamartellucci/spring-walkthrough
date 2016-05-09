package io.lucci.springwalkthrough.service;

import java.util.Collection;

import io.lucci.springwalkthrough.model.Status;
import io.lucci.springwalkthrough.model.Todo;

public interface TodoService {

	void addTodo(Todo todo);

	Collection<Todo> getTodos();

	void removeTodo(Long id);

	void updateTodoStatus(Long id, Status status);

	Todo getTodo(Long id);

}
