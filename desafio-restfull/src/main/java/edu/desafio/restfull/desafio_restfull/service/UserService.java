package edu.desafio.restfull.desafio_restfull.service;

import edu.desafio.restfull.desafio_restfull.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
