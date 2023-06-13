package org.arkham.examples.selling.products.service;

import org.arkham.examples.selling.products.model.common.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Ing. Jose Antonio Hernandez
 */
public interface UserService {

    Optional<User> saveUser(final User user);

    Optional<User> getUserByUserName(final String username);

    List<User> getAllusers();

    void deleteUserById(final Long id);

}
