package com_korit.kor_it_gov_spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


//SSR = > 즉 서버 쪽에서 웹페이지를 렌더링해서 반환하는 방식
@Controller

public class MainController {

    //동적인 요소가 없는 정적 웹페이지
    @GetMapping("/main")
    public String main(){
        return "main.html";
    }

    //SSR에 동적을 추가하려면 Thymeleaf를 적용
    //서버에서 HTML을 렌더링할때 자바데이터를 끼워넣을 수 있게 해주는 템플릿 엔진

    @GetMapping("/profile")
    public String getProfile(Model model){
        model.addAttribute("username", "<b>오영진</b>");
        model.addAttribute("isAdult", false);
        model.addAttribute("age", 24);
        Map<String, String> userlist = new HashMap<>();
        userlist.put("2영진", "27");
        userlist.put("3영진", "25");
        userlist.put("4영진", "26");
        userlist.put("오영진", "24");
        model.addAttribute("userlist", userlist);

        return "profile.html";

    }

    @GetMapping("/search")
    public String getSearch(@RequestParam String keyword, @RequestParam String keyword2, Model model) {
        model.addAttribute("keyword", keyword);
        model.addAttribute("keyword2", keyword2);

        return "search.html";

    }
}
