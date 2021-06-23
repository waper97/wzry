package com.waper.honor_of_king_data_analysis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 王鹏
 * @date 2020年8月17日16:42:39
 */
@SpringBootApplication
@EnableRabbit
//@MapperScan(basePackages = "com.waper.honor_of_king_data_analysis.mapper")
public class HonorOfKingDataAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HonorOfKingDataAnalysisApplication.class, args);
    }

}
