package com.supermap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2018/6/13.
 */
@SpringBootApplication
@MapperScan("com.supermap.*.mapper")
public class GeneratorAppl {

    public static void main(String[] args) {
        SpringApplication.run(GeneratorAppl.class,args);
    }

}
