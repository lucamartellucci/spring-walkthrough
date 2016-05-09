package io.lucci.springwalkthrough.todoapi.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.lucci.springwalkthrough.todoapi.persistence.entity.TodoEntity;

public interface TodoRepo extends JpaRepository<TodoEntity, Long> {

}
