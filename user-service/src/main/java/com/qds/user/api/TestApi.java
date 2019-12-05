package com.qds.user.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kong
 */
@Slf4j
@RestController
public class TestApi {

    @GetMapping(value = "/test")
    public Object test() {
        log.info("调用测试方法.....");
        Map<String, Object> map = new HashMap<>(8);
        map.put("time", LocalTime.now());
        map.put("date", LocalDate.now());
        map.put("dateTime", LocalDateTime.now());
        return map;
    }

}
