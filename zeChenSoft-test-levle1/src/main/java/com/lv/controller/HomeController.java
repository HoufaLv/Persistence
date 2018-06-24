package com.lv.controller;

import com.lv.entity.Token;
import com.lv.exception.ServiceException;
import com.lv.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 总控制器
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    public TokenService tokenService;

    /**
     * 访问项目
     *
     * @return resource url
     */
    @GetMapping
    public String home() {
        return "index";
    }

    /**
     * 访问项目 进行token校验
     *
     * @param token                    token
     * @param redirectAttributes       一次性提示消息
     * @return                         resource url
     */
    @PostMapping
    public String home(Token token,
                       RedirectAttributes redirectAttributes) {
        try {
            tokenService.verifyToken(token);
        } catch (ServiceException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "token 不正确,请重新输入");
            return "redirect:/home";
        }

        return "home";
    }

    /**
     * 用户退出登陆
     * @return
     */
    @GetMapping("/logout")
    public String logout(){

        return "redirect:/home";
    }
}
