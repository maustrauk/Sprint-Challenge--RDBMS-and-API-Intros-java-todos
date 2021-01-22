package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService{

    @Autowired
    private TodoRepository todorepo;

    @Transactional
    @Override
    public void markComplete(long todoid) {
        Todos updateTodo = todorepo.findById(todoid)
                .orElseThrow(() -> new EntityNotFoundException("Todos id " + todoid + " not found!"));
        updateTodo.setCompleted(true);
        todorepo.save(updateTodo);
    }
}
