package com.authblockchain.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JWTUtil {

    private static final String SECRET_KEY = "blockchain-secure-auth";

    public String generateToken(String walletAddress) {
        return Jwts.builder()
                .setSubject(walletAddress)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}