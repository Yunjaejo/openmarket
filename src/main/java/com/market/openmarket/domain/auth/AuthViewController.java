package com.market.openmarket.domain.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("auth")
@RequiredArgsConstructor
public class AuthViewController {

    @GetMapping("/password-reset")
    public String showPasswordResetForm(@RequestParam("token") String token) {
        return "redirect:/password-reset.html?token=" + token;
    }
}
