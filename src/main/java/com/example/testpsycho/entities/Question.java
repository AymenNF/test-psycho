package com.example.testpsycho.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;




@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "QUESTION")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private String type; // e.g., multiple choice, text, etc.

    public Question(String text, String type) {
        this.text = text;
        this.type = type;
    }

    @ManyToOne
    @JoinColumn(name = "questionnaire_id")
    private Questionnaire questionnaire;


}

