package com.example.testpsycho.entities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "QUESTIONNAIRE")
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @OneToMany(mappedBy = "questionnaire")
    private List<Question> questions;

    public Questionnaire(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
