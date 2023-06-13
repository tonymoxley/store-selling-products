package org.arkham.examples.selling.products.service;

import org.arkham.examples.selling.products.model.common.User;
import org.arkham.examples.selling.products.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Ing. Jose Antonio Hedz Cortes
 * @version 1.0
 * @since 12/jun./2023, 22:57
 **/
@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> saveUser(User user) {
        return Optional.empty();
    }

    @Override
    public Optional<User> getUserByUserName(String username) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllusers() {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
