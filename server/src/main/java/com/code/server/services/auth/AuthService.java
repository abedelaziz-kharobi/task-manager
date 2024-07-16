package com.code.server.services.auth;

import com.code.server.dto.SignupRequest;
import com.code.server.dto.UserDto;

public interface AuthService {
     UserDto signupUser(SignupRequest signupRequest);
     boolean hasUserWithEmail(String email);
}
