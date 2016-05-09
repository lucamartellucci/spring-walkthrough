package io.lucci.springwalkthrough.todoapi.service;

import java.util.Collection;

import io.lucci.springwalkthrough.todoapi.model.Status;
import io.lucci.springwalkthrough.todoapi.model.Todo;

public interface TodoService {

	void addTodo(Todo todo);

	Collection<Todo> getTodos();

	void removeTodo(Long id);

	void updateTodoStatus(Long id, Status status);

	Todo getTodo(Long id);

}
