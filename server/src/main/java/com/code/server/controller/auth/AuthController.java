package com.code.server.controller.auth;

import com.code.server.dto.SignupRequest;
import com.code.server.dto.UserDto;
import com.code.server.services.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signupUser(@RequestBody SignupRequest signupRequest){
        if (authService.hasUserWithEmail(signupRequest.getEmail()))
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("user already exist with this email");
        UserDto createdUserDto = authService.signupUser(signupRequest);
        if (createdUserDto == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("user not created");
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUserDto);
    }

}
