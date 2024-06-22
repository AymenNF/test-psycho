package com.example.testpsycho.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ReferenceSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String qrCode;
    private String uniqueIdentifier;
    private String careProviderContact;



    @OneToOne
    @JoinColumn(name = "result_id")
    private QuestionnaireResult questionnaireResult;


}
