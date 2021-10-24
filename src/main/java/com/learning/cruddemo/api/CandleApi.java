package com.learning.cruddemo.api;

import com.learning.cruddemo.db.CandleEntity;
import com.learning.cruddemo.service.CandleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/candle")
@RequiredArgsConstructor
public class CandleApi {
    private final CandleService candleService;

    @GetMapping("/allTime")
    public List<CandleMessage> getCandleAllTime() {

        return candleService.getAllTime().stream()
                .map(this::convert)
                .collect(Collectors.toList());


    }

    private CandleMessage convert(CandleEntity entity) {
        return new CandleMessage(
                entity.getOpenPrice(),
                entity.getClosePrice(),
                entity.getMinPrice(),
                entity.getMaxPrice(),
                entity.getOpenTs(),
                entity.getOpenTs() + 60_000
        );
    }


}
