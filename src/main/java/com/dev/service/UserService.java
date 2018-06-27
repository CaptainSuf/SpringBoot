package com.dev.service;

import com.dev.model.User;

public interface UserService {

    User selectUserById(int id)throws Exception;
}
