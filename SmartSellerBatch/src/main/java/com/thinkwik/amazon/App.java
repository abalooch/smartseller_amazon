package com.thinkwik.amazon;

import com.thinkwik.amazon.job.configuration.BatchConfiguration;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@EnableBatchProcessing
@EnableAutoConfiguration
@SpringBootApplication
public class App {
    public static void main(String [] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(
            BatchConfiguration.class, args)));
    }
}