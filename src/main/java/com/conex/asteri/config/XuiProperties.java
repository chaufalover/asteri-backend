package com.conex.asteri.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

//Se encarga de leer la configuracion del properties :baseUrl
@Data
@ConfigurationProperties(prefix = "xui")
@Component
public class XuiProperties {

    private String baseUrl;

}
