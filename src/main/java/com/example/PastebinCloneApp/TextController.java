package com.example.PastebinCloneApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TextController {

    public final TextService textService;

    public TextController(TextService textService) {
        this.textService = textService;
    }

    @GetMapping(path = "/")
    public String getHomepage(Model model) {
        model.addAttribute("texts", textService.getAllTexts());
        return "homepage";
    }

    @GetMapping(path = "/view_text")
    public String getExistentText(@RequestParam("value") String content, Model model) {
        model.addAttribute("currText", content);
        return "viewer";
    }

    @PostMapping(path = "/submit")
    public String createText(@RequestParam("inputText") String text) {
        Text wantToAddText = new Text(text);
        textService.createText(wantToAddText);
        return "success";
    }
}
