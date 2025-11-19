package com_korit.kor_it_gov_spring_boot.Controller2;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor

class todo {
    private String username;
    private int age;
    private String todo;
}

@Controller
public class MainController {

    private List<Object> todoList = new ArrayList<>();

    @GetMapping("/main")
    public String mainPage() {
        return "main.html";
    }

    @GetMapping("/todo")
    public String getTodo(Model model) {
        model.addAttribute("username", "<b>오영진<b>");
        model.addAttribute("age", 24);
        model.addAttribute("message", "할 일 목록");
        Map<String, String> userList = new HashMap<String, String>();

        todoList.add("message");
        model.addAttribute("message", userList);
        return "todo.html";
    }

    public String getList(Model model) {
        model.addAttribute("todoList", todoList);
        return "list.html";
    }
}
