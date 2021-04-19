package com.mxy1024.community.Model;

import lombok.Data;

/**
 * @Author: MachineYu
 * @date: 2021/4/5 16:20
 * @Version: 1.0
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
