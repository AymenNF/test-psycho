package com.example.testpsycho.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import org.springframework.data.annotation.Id;

public class ReferenceSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String qrCode;
    private String uniqueIdentifier;
    private String careProviderContact;

    public ReferenceSheet(String qrCode, String uniqueIdentifier, String careProviderContact) {
        this.qrCode = qrCode;
        this.uniqueIdentifier = uniqueIdentifier;
        this.careProviderContact = careProviderContact;
    }

    @OneToOne
    @JoinColumn(name = "result_id")
    private QuestionnaireResult questionnaireResult;
}
