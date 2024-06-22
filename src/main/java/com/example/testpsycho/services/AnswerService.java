package com.example.testpsycho.services;

import com.example.testpsycho.entities.Answer;
import com.example.testpsycho.entities.QuestionnaireResult;
import com.example.testpsycho.repositories.AnswerRepository;
import com.example.testpsycho.repositories.QuestionnaireResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionnaireResultRepository questionnaireResultRepository;

    public QuestionnaireResult submitAnswers(List<Answer> answers) {
        if (answers.isEmpty()) {
            throw new RuntimeException("No answers provided");
        }

        QuestionnaireResult result = new QuestionnaireResult();
        result.setSubmissionDate(LocalDateTime.now());
        result.setUser(answers.get(0).getQuestionnaireResult().getUser());
        result.setQuestionnaire(answers.get(0).getQuestion().getQuestionnaire());

        result = questionnaireResultRepository.save(result);

        for (Answer answer : answers) {
            answer.setQuestionnaireResult(result);
            answerRepository.save(answer);
        }

        return result;
    }

    public List<Answer> getAnswers(Long resultId) {
        return answerRepository.findByQuestionnaireResultId(resultId);
    }
}

