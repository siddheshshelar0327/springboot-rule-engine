package com.example.demo;

import com.example.demo.model.Rule;
import com.example.demo.repository.RuleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(RuleRepository ruleRepository) {
        return (args) -> {
            Rule rule1 = new Rule("amount > 500", "High Amount Rule");
            Rule rule2 = new Rule("country == 'IN'", "India Specific Rule");
            ruleRepository.save(rule1);
            ruleRepository.save(rule2);

            System.out.println("✅ Rules inserted into the database!");
        };
    }


}
