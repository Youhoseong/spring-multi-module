package com.example.modulecommon.repository;

import com.example.modulecommon.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {


}
