package com.luban.postProcessor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("com.luban.postProcessor")
@Lazy(true)
public class Appconfig {
}
