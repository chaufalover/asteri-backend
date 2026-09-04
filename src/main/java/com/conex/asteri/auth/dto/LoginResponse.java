package com.conex.asteri.auth.dto;

import lombok.Builder;

//Respondera a XuiAuthResponse
//Necesario para poder manejar la data del JSON devuelto por el sv

@Builder
public record LoginResponse(
        String username,
        String status,
        String expDate,
        String maxConnections) {
}

