package dev.springsecurityjwt.service;

import dev.springsecurityjwt.entity.User;
import dev.springsecurityjwt.security.UserPrincipal;

public interface UserService {
    User createUser(User user);

    UserPrincipal findByUsername(String username);
}
