package com.qds.eureka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaApplicationTests {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void contextLoads() throws IOException {
        Demo demo = new Demo();
        demo.setTime(LocalDateTime.of(2019,1,10,15,1));
        String json = objectMapper.writeValueAsString(demo);
        System.out.println(json);
        System.out.println(objectMapper.readValue(json, Demo.class));
        System.out.println(objectMapper.writeValueAsString(LocalDate.now()));
        System.out.println(objectMapper.readValue("{\"time\":\"2019-01-10T15:01:00\"}", Demo.class));
    }


}
