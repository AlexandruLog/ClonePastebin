package com.example.PastebinCloneApp;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextService {

    public final TextRepository textRepository;


    public TextService(TextRepository textRepository) {
        this.textRepository = textRepository;
    }

    public List<Text> getAllTexts() {
        return textRepository.findAll();
    }

    public void createText(Text text) {
        textRepository.save(text);
    }
}
