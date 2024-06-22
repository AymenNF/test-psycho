package com.example.testpsycho.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    public UserApp(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @OneToMany(mappedBy = "user")
    private List<QuestionnaireResult> questionnaireResults;


}

