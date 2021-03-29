package com.mxy1024.community;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: MachineYu
 * @date: 2021/3/29 18:24
 * @Version: 1.0
 */

@Controller
public class AuthorizeController {
    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code,
                           @RequestParam(name="state") String state){
        return "index";
    }
}
