package com.example.dz3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String startPage() {
        return "home.html";
    }

    @RequestMapping("/google")
    public  String searchGoogle(@RequestParam("searchGoogle") String search){
        return "redirect:https://www.google.com/search?q=" + search;
    }

    @RequestMapping("/yandex")
    public  String searchYandex(@RequestParam("searchYandex") String search){
        return "redirect:https://yandex.ru/search/?lr=2&text=" + search;
    }

    @RequestMapping("/duckduckgo")
    public  String searchDuck(@RequestParam("searchDuckduckgo")  String search){
        return "redirect:https://duckduckgo.com/?q=" + search;
    }
}
