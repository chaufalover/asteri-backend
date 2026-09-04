package com.conex.asteri.auth.dto;

public record LoginRequest(
        String username,
        String password) {
}
