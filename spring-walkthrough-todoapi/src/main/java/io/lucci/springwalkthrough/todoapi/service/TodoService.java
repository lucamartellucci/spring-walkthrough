package io.lucci.springwalkthrough.todoapi.service;

import java.util.Collection;

import io.lucci.springwalkthrough.commons.model.Status;
import io.lucci.springwalkthrough.commons.model.Todo;

public interface TodoService {

	Todo addTodo(Todo todo);

	Collection<Todo> getTodos();

	void removeTodo(Long id);

	void updateTodoStatus(Long id, Status status);

	Todo getTodo(Long id);

}
