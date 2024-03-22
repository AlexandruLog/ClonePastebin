package com.example.PastebinCloneApp;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;

@Entity
@Table(name = "texts")
public class Text {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "TEXT")
    private String content;

    public Text() {}

    public Text(String content) {
        this.content = content;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }
}
