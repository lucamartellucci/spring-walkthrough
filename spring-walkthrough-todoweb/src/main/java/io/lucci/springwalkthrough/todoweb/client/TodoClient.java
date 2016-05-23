package io.lucci.springwalkthrough.todoweb.client;

import java.util.Collection;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.lucci.springwalkthrough.commons.model.Status;
import io.lucci.springwalkthrough.commons.model.Todo;

@FeignClient("todo-api")
public interface TodoClient {

	@RequestMapping(method = RequestMethod.POST, value = "/todos")
	Todo addTodo(@RequestBody Todo todo);

	@RequestMapping(method = RequestMethod.GET, value = "/todos")
	Collection<Todo> getTodos();

//	void removeTodo(Long id);
//
//	@RequestMapping(method = RequestMethod.PUT, value = "/todos/{id}")
//	void updateTodoStatus(@RequestBody Todo todo);
//
//	@RequestMapping(method = RequestMethod.GET, value = "/todos/{id}")
//	Todo getTodo(@PathVariable("id") Long id);

}
