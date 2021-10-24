package com.learning.cruddemo.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandleMessage {
    private  BigDecimal openPrice;
    private  BigDecimal closePrice;
    private  BigDecimal minPrice;
    private  BigDecimal maxPrice;
    private  long openTs;
    private  long closeTs;

}
