package io.lucci.springwalkthrough.commons.resource;

import java.util.Collection;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.lucci.springwalkthrough.commons.model.Todo;

public interface TodoResource {

	@RequestMapping(value = "/todos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Collection<Todo>> getTodos() throws Exception;

	@RequestMapping(value = "/todos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Todo> addTodo(@RequestBody Todo todo) throws Exception;

	@RequestMapping(value = "/todos/{id}/done", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Todo> doneTodo(@PathVariable(value="id") Long id) throws Exception;

	@RequestMapping(value = "/todos/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Todo> getTodo(@PathVariable(value="id") Long id) throws Exception;

	@RequestMapping(value = "/todos/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<Void> removeTodo(@PathVariable(value="id") Long id) throws Exception;
}
