package com.learning.cruddemo;

import com.learning.cruddemo.api.CandleMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles("test")
@TestComponent
class CruddemoApplicationTests {

    @Container
    public static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:13")
            .withDatabaseName("candle")
            .withUsername("postgres")
            .withPassword("root");

    @Test
    void testGetAllTime() {
        RestTemplate restTemplate = new RestTemplate();
        CandleMessage[] candleMessages = restTemplate.getForObject("http://localhost:8081/v1/candle/allTime",
                CandleMessage[].class
        );
        Assertions.assertEquals(1, candleMessages.length);
    }


}
