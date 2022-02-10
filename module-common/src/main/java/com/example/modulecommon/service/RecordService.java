package com.example.modulecommon.service;


import com.example.modulecommon.model.Record;
import com.example.modulecommon.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecordService {
    private final RecordRepository recordRepository;

    public void createRecord() {
        recordRepository.save(new Record(10));

    }
}
