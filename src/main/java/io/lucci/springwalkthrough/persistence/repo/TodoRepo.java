package io.lucci.springwalkthrough.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.lucci.springwalkthrough.persistence.entity.TodoEntity;

public interface TodoRepo extends JpaRepository<TodoEntity, Long> {

}
