package com.mxy1024.community.Model;

import lombok.Data;

/**
 * @Author: MachineYu
 * @date: 2021/4/8 15:22
 * @Version: 1.0
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
