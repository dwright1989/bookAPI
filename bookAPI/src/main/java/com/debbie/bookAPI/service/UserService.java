package com.debbie.bookAPI.service;

import com.debbie.bookAPI.dto.UserDto;
import com.debbie.bookAPI.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}