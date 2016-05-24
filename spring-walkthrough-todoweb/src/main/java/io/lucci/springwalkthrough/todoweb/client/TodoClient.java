package io.lucci.springwalkthrough.todoweb.client;

import org.springframework.cloud.netflix.feign.FeignClient;

import io.lucci.springwalkthrough.commons.resource.TodoResource;

@FeignClient("todo-api")
public interface TodoClient extends TodoResource {

}
