package com.example.testpsycho.controllers;

import com.example.testpsycho.entities.ReferenceSheet;
import com.example.testpsycho.services.ReferenceSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reference-sheets")
public class ReferenceSheetController {

    @Autowired
    private ReferenceSheetService referenceSheetService;

    @GetMapping("/result/{resultId}")
    public ResponseEntity<ReferenceSheet> getReferenceSheet(@PathVariable Long resultId) {
        return ResponseEntity.ok(referenceSheetService.getReferenceSheet(resultId));
    }
}

