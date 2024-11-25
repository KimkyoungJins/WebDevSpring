package org.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    Model model;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Spring boot 홈페이지");
        return "home";
    }

    // 과목 목록을 보여주는 메서드 추가
    @GetMapping("/subjects")
    public String showSubjects(Model model) {
        List<String> subjects = Arrays.asList(
                "수학",
                "물리",
                "화학",
                "컴퓨터 공학"
        );
        model.addAttribute("subjects", subjects);
        return "subjects";
    }


    @RequestMapping("/classlist")
    public String classList(){

        List<String> list = new ArrayList<String>();
        list.add("웹서비스 개발하기");
        list.add("컴퓨터 구조");
        list.add("시스템 프로그래밍");
        model.addAttribute("classList", list);
        return "list";
    }
}
