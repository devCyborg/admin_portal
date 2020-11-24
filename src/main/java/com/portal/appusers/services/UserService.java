package com.portal.appusers.services;

import com.portal.appusers.domain.User;

public interface UserService {
   User findUserByUsername(String username);
    User findUserByEmail(String email);
}
