package com.absontheweb.springwalkthrough.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absontheweb.springwalkthrough.persistence.entity.TodoEntity;

public interface TodoRepo extends JpaRepository<TodoEntity, Long> {

}
