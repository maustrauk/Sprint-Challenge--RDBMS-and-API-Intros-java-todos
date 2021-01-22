package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.User;
import com.lambdaschool.todos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService{

    @Autowired
    private UserRepository userrepo;

    @Transactional
    @Override
    public void markComplete(long todoid) {

    }
}
