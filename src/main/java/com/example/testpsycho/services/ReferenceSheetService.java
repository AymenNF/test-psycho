package com.example.testpsycho.services;

import com.example.testpsycho.entities.QuestionnaireResult;
import com.example.testpsycho.entities.ReferenceSheet;
import com.example.testpsycho.repositories.QuestionnaireResultRepository;
import com.example.testpsycho.repositories.ReferenceSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReferenceSheetService {

    @Autowired
    private ReferenceSheetRepository referenceSheetRepository;

    @Autowired
    private QuestionnaireResultRepository questionnaireResultRepository;

    public ReferenceSheet getReferenceSheet(Long resultId) {
        QuestionnaireResult result = questionnaireResultRepository.findById(resultId)
                .orElseThrow(() -> new RuntimeException("Questionnaire result not found"));

        ReferenceSheet sheet = new ReferenceSheet();
        sheet.setQrCode("GeneratedQRCode");
        sheet.setUniqueIdentifier("UniqueIdentifier");
        sheet.setCareProviderContact("Contact information");
        sheet.setQuestionnaireResult(result);

        return referenceSheetRepository.save(sheet);
    }
}

