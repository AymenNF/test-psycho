package com.example.testpsycho.repositories;

import com.example.testpsycho.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findByQuestionnaireResultId(Long resultId);
}

