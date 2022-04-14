package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String index(){
        return "index";
    }
    @PostMapping("/translate")
    public String translate(@RequestParam String word, Model model){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello","xin chao");
        dictionary.put("how","the nao");
        dictionary.put("where","o dau");
        dictionary.put("nuclear","Kim Jong Un");
        String result = dictionary.get(word);
        if (result == null){
            model.addAttribute("word",word);
            model.addAttribute("result","not found");
        } else {
            model.addAttribute("word",word);
            model.addAttribute("result",result);
        }
        return "translate";
    }
}
