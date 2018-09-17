package com.temp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.temp.model.ApplicationUser;
import com.temp.repository.ApplicationUserRepository;
import com.temp.resolver.Mutation;
import com.temp.resolver.Query;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public Mutation mutation(ApplicationUserRepository applicationUserRepository) {
        return new Mutation(applicationUserRepository);
    }

    @Bean
    public Query query(ApplicationUserRepository applicationUserRepository) {
        return new Query(applicationUserRepository);
    }

    @Bean
    public CommandLineRunner demo(ApplicationUserRepository applicationUserRepository) {
        return (args) -> {
            ApplicationUser user = new ApplicationUser();
            applicationUserRepository.save(user);
        };
    }
}