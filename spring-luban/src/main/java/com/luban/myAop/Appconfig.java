package com.luban.myAop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luban.myAop")
@EnableMyAop
public class Appconfig {
}
