package io.lucci.springwalkthrough.todoapi.service;

import java.util.Collection;
import java.util.Optional;

import io.lucci.springwalkthrough.commons.model.Status;
import io.lucci.springwalkthrough.commons.model.Todo;

public interface TodoService {

	Todo addTodo(Todo todo);

	Collection<Todo> getTodos();

	void removeTodo(Long id);

	Optional<Todo> updateTodoStatus(Long id, Status status);

	Optional<Todo> getTodo(Long id);

}
