package com.authblockchain.controller;

import org.springframework.web.bind.annotation.*;
import com.authblockchain.service.BlockchainAuthService;
import com.authblockchain.model.User;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final BlockchainAuthService authService;

    public AuthController(BlockchainAuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {
        return authService.authenticate(user);
    }
}