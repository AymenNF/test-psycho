package com.example.testpsycho.repositories;

import com.example.testpsycho.entities.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Long> {
}

