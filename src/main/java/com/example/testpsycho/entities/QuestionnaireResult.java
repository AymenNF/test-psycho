package com.example.testpsycho.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class QuestionnaireResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime submissionDate;
    private Integer score;

    public QuestionnaireResult(LocalDateTime submissionDate, Integer score) {
        this.submissionDate = submissionDate;
        this.score = score;
    }

    @ManyToOne
    private UserApp user;

    @OneToMany(mappedBy = "questionnaireResult")
    private List<Answer> answers;

    @ManyToOne
    @JoinColumn(name = "questionnaire_id")
    private Questionnaire questionnaire;

}
