package io.lucci.springwalkthrough.todoapi.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
//	@RequestMapping(path="/todos/done", method=RequestMethod.GET)
//	public String doneTodo(@RequestParam Long id, Model model) throws Exception {
//		
//		logger.info("Done for todo with id {}",id);
//		
//		// update the todo status
//		todoService.updateTodoStatus(id, Status.DONE);
//		
//		fillWithTodos(model);
//		// name of the view
//		return "redirect:/todos";
//	}
//	
//	@RequestMapping(path="/todos/trash", method=RequestMethod.GET)
//	public String todoTrash(@RequestParam Long id, Model model) throws Exception {
//		
//		logger.info("Done for todo with id {}",id);
//		
//		// update the todo status
//		todoService.removeTodo(id);
//		
//		fillWithTodos(model);
//		// name of the view
//		return "redirect:/todos";
//	}
//
//	
//	private void fillWithTodos(Model model) {
//		// add the collection of todos
//		model.addAttribute("todos", todoService.getTodos());
//		// add an empty object used to add a new todo
//		model.addAttribute("newtodo", new Todo());
//	}

}
