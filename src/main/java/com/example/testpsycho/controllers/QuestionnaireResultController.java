package com.example.testpsycho.controllers;

import com.example.testpsycho.entities.Answer;
import com.example.testpsycho.entities.QuestionnaireResult;
import com.example.testpsycho.services.QuestionnaireResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
public class QuestionnaireResultController {

    @Autowired
    private QuestionnaireResultService questionnaireResultService;

    @PostMapping
    public ResponseEntity<QuestionnaireResult> submitAnswers(@RequestBody List<Answer> answers) {
        return ResponseEntity.ok(questionnaireResultService.submitAnswers(answers));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<QuestionnaireResult>> getAllResults(@PathVariable Long userId) {
        return ResponseEntity.ok(questionnaireResultService.getAllResults(userId));
    }

    @GetMapping("/user/{userId}/{resultId}")
    public ResponseEntity<QuestionnaireResult> getResultById(@PathVariable Long userId, @PathVariable Long resultId) {
        return ResponseEntity.ok(questionnaireResultService.getResultById(userId, resultId));
    }
}