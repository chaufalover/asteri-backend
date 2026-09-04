package com.conex.asteri.xui.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.conex.asteri.config.XuiProperties;
import com.conex.asteri.xui.dto.XuiAuthResponse;

import lombok.RequiredArgsConstructor;

/*
 * CLIENTE QUE SE CONECTA A LA API DE XUI
 */
@Component
@RequiredArgsConstructor
public class XuiClient {

    private final XuiProperties properties;

    private final RestClient restClient = RestClient.create();

    public XuiAuthResponse authenticate(
            String username,
            String password) {

        String url = String.format(
                "%s/player_api.php?username=%s&password=%s",
                properties.getBaseUrl(),
                username,
                password);

        return restClient.get()
                .uri(url)
                .retrieve()
                .body(XuiAuthResponse.class);
    }
}
