package com.conex.asteri.xui.dto;

//para el campo server_info del JSON que devuelve el sv
/*
  "server_info": {
    "xui": true,
    "version": "1.5.13",
                    "revision":null,
    "url":"cctvplaytv.pe",
    "port":"80",
                    "https_port":"443",
                    "server_protocol":"h:1781889213,
                    "time_now":"2026-06-19 12:13:33",
                    "time
  }
    Por ahora se esta trabajando solo con 4 atributos
*/
public record XuiServerInfo(

        Boolean xui,
        String version,
        String url,
        String port

) {

}
