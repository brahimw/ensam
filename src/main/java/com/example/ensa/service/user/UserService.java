package com.example.ensa.service.user;

import com.example.ensa.dto.SignupRequest;
import com.example.ensa.dto.UserDto;

public interface UserService {

     UserDto createUser(SignupRequest signupRequest) throws Exception;

     Boolean hasUserWithEmail(String email);

     UserDto getUser(Long userId);


}
