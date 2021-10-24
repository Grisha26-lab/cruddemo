package com.learning.cruddemo.service;

import com.learning.cruddemo.db.CandleEntity;
import com.learning.cruddemo.db.CandleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandleService {


    private final CandleRepository candleRepository;


    public List<CandleEntity> getAllTime(){
         return candleRepository.findAll();

    }
}
