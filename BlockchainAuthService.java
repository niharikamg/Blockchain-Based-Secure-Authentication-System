package com.authblockchain.service;

import org.springframework.stereotype.Service;
import com.authblockchain.model.User;

@Service
public class BlockchainAuthService {

    public String authenticate(User user) {
        // Simulated Blockchain Authentication (Replace with real Smart Contract Call)
        if (user.getWalletAddress().startsWith("0x")) {
            return "User authenticated via blockchain!";
        }
        return "Authentication failed.";
    }
}