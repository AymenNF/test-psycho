package com.example.testpsycho.services;

import com.example.testpsycho.entities.Answer;
import com.example.testpsycho.entities.QuestionnaireResult;
import com.example.testpsycho.repositories.QuestionnaireResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionnaireResultService {

    @Autowired
    private QuestionnaireResultRepository questionnaireResultRepository;

    public List<QuestionnaireResult> getAllResults(Long userId) {
        return questionnaireResultRepository.findByUserId(userId);
    }

    public QuestionnaireResult getResultById(Long userId, Long resultId) {
        Optional<QuestionnaireResult> result = Optional.ofNullable(questionnaireResultRepository.findByIdAndUserId(resultId, userId));
        return result.orElseThrow(() -> new RuntimeException("Result not found"));
    }

    public QuestionnaireResult submitAnswers(List<Answer> answers) {
        QuestionnaireResult result = new QuestionnaireResult();
        result.setAnswers(answers);
        return questionnaireResultRepository.save(result);
    }
}