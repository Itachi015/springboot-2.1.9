package com.qds.user;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import com.qds.user.constans.TimeConstans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author kong
 */
@EnableEurekaClient
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    /**
     * 时间序列化和反序列化
     *
     * @return
     * @since 1.8
     */
    @Bean
    public JavaTimeModule javaTimeModule() {
        JavaTimeModule module = new JavaTimeModule();
        module.addSerializer(LocalTime.class, new LocalTimeSerializer(TimeConstans.H_M_S));
        module.addDeserializer(LocalTime.class, new LocalTimeDeserializer(TimeConstans.H_M_S));

        module.addSerializer(LocalDate.class, new LocalDateSerializer(TimeConstans.Y_M_D));
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer(TimeConstans.Y_M_D));

        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(TimeConstans.Y_M_D_H_M_S));
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(TimeConstans.Y_M_D_H_M_S));
        return module;
    }

}
