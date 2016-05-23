package io.lucci.springwalkthrough.todoapi.controller;

import java.util.Collection;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.lucci.springwalkthrough.commons.model.Status;
import io.lucci.springwalkthrough.commons.model.Todo;
import io.lucci.springwalkthrough.todoapi.service.TodoService;

@RestController
public class TodoController {
	
	private static final Logger logger = LoggerFactory.getLogger(TodoController.class);
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value = "/todos", 
		method = RequestMethod.GET, 
		produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Todo>> getTodos() throws Exception {
		return ResponseEntity.ok(todoService.getTodos());
	}
	
	@RequestMapping(value = "/todos", 
			method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) throws Exception {
		logger.info("Adding the todo {}", todo);
		return ResponseEntity.ok(todoService.addTodo(todo));
	}
	
	@RequestMapping(value = "/todos/{id}/done", 
			method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> doneTodo(@PathVariable Long id) throws Exception {
		logger.info("Update the status to DONE for the todo with id {}", id);
		Optional<Todo> todo = todoService.updateTodoStatus(id, Status.DONE);
		if (todo.isPresent()){
			return ResponseEntity.ok(todo.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@RequestMapping(value = "/todos/{id}", 
			method = RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> removeTodo(@PathVariable Long id) throws Exception {
		logger.info("Delete the todo with id {}", id);
		Optional<Todo> todo = todoService.getTodo(id);
		if (todo.isPresent()){
			todoService.removeTodo(id);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
