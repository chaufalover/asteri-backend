package com.conex.asteri.xui.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

//recopila informacion del JSON, especificamente del user_info
/*
  "user_info": {
    "username": "x8",
    "password": "x8",
    "message": "Welcome to XUI.one",
    "auth": 1,
    "status": "Active",
    "exp_date": "1797699550",
    "is_trial": "0",
    "active_cons": 0,
    "created_at": "1781888350",
    "max_connections": "3",
    "allowed_output_formats": [
      "m3u8",
      "ts",
      "rtmp"
    ]
  }
*/
public record XuiUserInfo(

        String username,

        String password,

        String message,

        Integer auth,

        String status,

        @JsonProperty("exp_date") String expDate,

        @JsonProperty("is_trial") String isTrial,

        @JsonProperty("active_cons") Integer activeConnections,

        @JsonProperty("created_at") String createdAt,

        @JsonProperty("max_connections") String maxConnections,

        @JsonProperty("allowed_output_formats") List<String> allowedOutputFormats) {

}
