package com.mxy1024.community.dto;

import com.mxy1024.community.Model.User;
import lombok.Data;

/**
 * @Author: MachineYu
 * @date: 2021/4/9 16:43
 * @Version: 1.0
 */
@Data
public class QuestionDTO {
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
    private User user;

}
