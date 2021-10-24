package com.learning.cruddemo.db;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "candle")
@Data
@NoArgsConstructor
public class CandleEntity {
    @Id
    private long openTs;
    private BigDecimal openPrice;
    private BigDecimal closePrice;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;


}
