package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class DemoConfiguration {

  @Bean
  public ClassPathScanningCandidateComponentProvider classPathScanningCandidateComponentProvider(Environment environment) {
    ClassPathScanningCandidateComponentProvider classPathScanningCandidateComponentProvider =
        new ClassPathScanningCandidateComponentProvider(true, environment);
    classPathScanningCandidateComponentProvider.findCandidateComponents("com.example");
    return classPathScanningCandidateComponentProvider;
  }
}
