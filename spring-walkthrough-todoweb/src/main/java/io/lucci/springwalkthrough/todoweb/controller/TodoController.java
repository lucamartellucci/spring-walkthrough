package io.lucci.springwalkthrough.todoweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.lucci.springwalkthrough.commons.model.Todo;
import io.lucci.springwalkthrough.todoweb.client.TodoClient;

@Controller
public class TodoController {
	
	private static final Logger logger = LoggerFactory.getLogger(TodoController.class);
	
	@Autowired
	private TodoClient todoClient;
	
	@RequestMapping(path="/todos", method=RequestMethod.GET)
	public String listTodos(Model model) throws Exception {
		
		logger.info("Loading the todo list");
		
		fillWithTodos(model);
		// name of the view
		return "todo";
	}
	
	@RequestMapping(path="/todos/done", method=RequestMethod.GET)
	public String doneTodo(@RequestParam Long id, Model model) throws Exception {
		
		logger.info("Done for todo with id {}",id);
		
		// update the todo status
		todoClient.doneTodo(id);
		
		fillWithTodos(model);
		// name of the view
		return "redirect:/todos";
	}
	
	@RequestMapping(path="/todos/trash", method=RequestMethod.GET)
	public String todoTrash(@RequestParam Long id, Model model) throws Exception {
		
		logger.info("Done for todo with id {}",id);
		
		// update the todo status
		todoClient.removeTodo(id);
		
		fillWithTodos(model);
		// name of the view
		return "redirect:/todos";
	}

	@RequestMapping(path="/addtodo", method=RequestMethod.POST)
	public String todoAdd(@ModelAttribute Todo todo, Model model) throws Exception {
		
		logger.info("Adding the todo {}", todo);
		todoClient.addTodo(todo);
		
		fillWithTodos(model);
		// name of the view
		return "redirect:/todos";
	}
	
	private void fillWithTodos(Model model) {
		// add the collection of todos
		model.addAttribute("todos", todoClient.getTodos());
		// add an empty object used to add a new todo
		model.addAttribute("newtodo", new Todo());
	}

}
