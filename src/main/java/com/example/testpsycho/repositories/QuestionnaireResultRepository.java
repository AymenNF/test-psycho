package com.example.testpsycho.repositories;

import com.example.testpsycho.entities.QuestionnaireResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionnaireResultRepository extends JpaRepository<QuestionnaireResult, Long> {
    List<QuestionnaireResult> findByUserId(Long userId);
    QuestionnaireResult findByIdAndUserId(Long id, Long userId);
}
