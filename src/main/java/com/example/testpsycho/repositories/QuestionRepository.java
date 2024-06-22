package com.example.testpsycho.repositories;

import com.example.testpsycho.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuestionnaireId(Long questionnaireId);
    Question findByIdAndQuestionnaireId(Long id, Long questionnaireId);
}

