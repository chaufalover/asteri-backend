package com.conex.asteri.xui.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

// Llama las clases para sacar la info del JSON
/*
  {
  "user_info": {},
  "server_info": {}
}

*/
@Data
public class XuiAuthResponse {

  @JsonProperty("user_info")
  private XuiUserInfo userInfo;

  @JsonProperty("server_info")
  private XuiServerInfo serverInfo;

}
