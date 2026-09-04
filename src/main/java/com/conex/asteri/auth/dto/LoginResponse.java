package com.conex.asteri.auth.dto;

//Respondera a XuiAuthResponse
//Necesario para poder manejar la data del JSON devuelto por el sv

public record LoginResponse(
        String username,
        String status,
        String experitionDate,
        String maxConnections) {
}
