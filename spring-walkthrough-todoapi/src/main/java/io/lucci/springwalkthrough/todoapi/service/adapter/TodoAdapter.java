package io.lucci.springwalkthrough.todoapi.service.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import io.lucci.springwalkthrough.todoapi.model.Todo;
import io.lucci.springwalkthrough.todoapi.persistence.entity.TodoEntity;

@Component
public class TodoAdapter {

	public Todo toTodo(TodoEntity entity) {
		if (entity == null) {
			return null;
		}
		Todo todo = new Todo();
		BeanUtils.copyProperties(entity, todo);
		return todo;
	}
	
	public List<Todo> toTodos(List<TodoEntity> entities){
		List<Todo> todos = new ArrayList<>();
		if (entities != null){
			entities.stream().forEach(e -> todos.add(toTodo(e)));
		}
		return todos;
	}

	public TodoEntity toEntity(Todo todo) {
		if (todo == null) {
			return null;
		}
		
		TodoEntity entity = new TodoEntity();
		BeanUtils.copyProperties(todo, entity);
		return entity;
	}
}
