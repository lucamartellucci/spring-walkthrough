package io.lucci.springwalkthrough.todoapi.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.lucci.springwalkthrough.commons.model.Status;
import io.lucci.springwalkthrough.commons.model.Todo;
import io.lucci.springwalkthrough.commons.resource.TodoResource;
import io.lucci.springwalkthrough.todoapi.service.TodoService;

@RestController
public class TodoController implements TodoResource {
	
	private static final Logger LOG = LoggerFactory.getLogger(TodoController.class);
	
	@Autowired
	private TodoService todoService;
	
	@Override
	public ResponseEntity<Collection<Todo>> getTodos() throws Exception {
		return ResponseEntity.ok(todoService.getTodos());
	}
	
	@Override
	public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) throws Exception {
		LOG.info("Adding the todo {}", todo);
		return ResponseEntity.ok(todoService.addTodo(todo));
	}
	
	@Override
	public ResponseEntity<Todo> doneTodo(@PathVariable Long id) throws Exception {
		
		LOG.info("Update the status to DONE for the todo with id {}", id);
		return ResponseEntity.ok(
			todoService.updateTodoStatus(id, Status.DONE).orElseThrow(ResourceNotFoundException::new)
		);
	}
	
	@Override
	public ResponseEntity<Todo> getTodo(@PathVariable Long id) throws Exception {
		
		LOG.info("Get the todo with id {}", id);
		return ResponseEntity.ok(
			todoService.getTodo(id).orElseThrow(ResourceNotFoundException::new)
		);
	}
	
	@Override
	public ResponseEntity<Void> removeTodo(@PathVariable Long id) throws Exception {
		LOG.info("Delete the todo with id {}", id);
		
		// check if the todo is present
		todoService.getTodo(id).orElseThrow(ResourceNotFoundException::new);
		
		// remove the todo
		todoService.removeTodo(id);
		return ResponseEntity.ok().build();
	}

}
