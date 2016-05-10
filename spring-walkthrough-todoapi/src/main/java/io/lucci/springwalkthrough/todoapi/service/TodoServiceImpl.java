package io.lucci.springwalkthrough.todoapi.service;

import java.time.LocalDateTime;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.lucci.springwalkthrough.commons.model.Status;
import io.lucci.springwalkthrough.commons.model.Todo;
import io.lucci.springwalkthrough.todoapi.persistence.entity.TodoEntity;
import io.lucci.springwalkthrough.todoapi.persistence.repo.TodoRepo;
import io.lucci.springwalkthrough.todoapi.service.adapter.TodoAdapter;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoRepo repo;
	
	@Autowired
	private TodoAdapter todoAdapter;
	
	@Override
	public Todo addTodo(Todo todo){
		todo.setStatus(Status.ACTIVE);
		todo.setCreationDate(LocalDateTime.now());
		TodoEntity savedTodo = repo.save(todoAdapter.toEntity(todo));
		return todoAdapter.toTodo(savedTodo);
	}
	
	@Override
	public Todo getTodo(Long id) {
		return todoAdapter.toTodo(repo.findOne(id));
	}
	
	@Override
	public void updateTodoStatus(Long id, Status status) {
		TodoEntity entity = repo.findOne(id);
		entity.setStatus(status);
		repo.save(entity);
	}
	
	@Override
	public void removeTodo(Long id) {
		repo.delete(id);
	}
	
	@Override
	public Collection<Todo> getTodos(){
		return todoAdapter.toTodos(repo.findAll());
	}

}
