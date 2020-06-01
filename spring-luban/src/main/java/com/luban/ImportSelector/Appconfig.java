package com.luban.ImportSelector;

import com.luban.ConfigurationAnnotation.IndexServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class Appconfig {
}
