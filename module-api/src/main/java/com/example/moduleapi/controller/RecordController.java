package com.example.moduleapi.controller;

import com.example.modulecommon.service.RecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RecordController {
    private final RecordService recordService;

    @PostMapping("/record")
    public String createRecord() {
        recordService.createRecord();
        return "success.";
    }

}
