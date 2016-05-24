package io.lucci.springwalkthrough.todoapi.service.adapter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import io.lucci.springwalkthrough.commons.model.Todo;
import io.lucci.springwalkthrough.todoapi.persistence.entity.TodoEntity;

@Component
public class TodoAdapter {

	public Optional<Todo> toTodo(TodoEntity entity) {
		if (entity == null) {
			return Optional.empty();
		}
		Todo todo = new Todo();
		BeanUtils.copyProperties(entity, todo);
		return Optional.of(todo);
	}
	
	public List<Todo> toTodos(List<TodoEntity> entities){
		return entities.parallelStream().map(e -> toTodo(e).get()).collect(Collectors.toList());
	}

	public TodoEntity toEntity(Todo todo) {
		TodoEntity entity = new TodoEntity();
		BeanUtils.copyProperties(todo, entity);
		return entity;
	}
}
