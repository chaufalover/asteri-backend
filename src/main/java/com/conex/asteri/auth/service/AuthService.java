package com.conex.asteri.auth.service;

import org.springframework.stereotype.Service;

import com.conex.asteri.auth.dto.LoginRequest;
import com.conex.asteri.auth.dto.LoginResponse;
import com.conex.asteri.xui.client.XuiClient;
import com.conex.asteri.xui.dto.XuiAuthResponse;

import lombok.RequiredArgsConstructor;

/*
Logica de autenticacion
1. Recibir peticion de login
2.  Autentica las credenciales
3.  Mapear la respuesta del sv a la respuesta deseada
4. Devuelve la info del usuario
*/
@Service
@RequiredArgsConstructor
public class AuthService {
    private final XuiClient xuiClient;

    public LoginResponse login(LoginRequest request) {

        XuiAuthResponse response = xuiClient.authenticate(
                request.username(),
                request.password());

        return LoginResponse.builder()
                .username(response.getUserInfo().username())
                .status(response.getUserInfo().status())
                .expDate(response.getUserInfo().expDate())
                .maxConnections(response.getUserInfo().maxConnections())
                .build();

    }
}

