package com.example.PastebinCloneApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, Long> {
}
