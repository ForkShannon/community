package com.mxy1024.community.dto;

import lombok.Data;

/**
 * @Author: MachineYu
 * @date: 2021/3/29 18:29
 * @Version: 1.0
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
