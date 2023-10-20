package com.kgisl.spring1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({ "com.kgisl.spring1" })
public class MVCconfig implements WebMvcConfigurer {

}
