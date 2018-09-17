package com.temp.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.temp.model.ApplicationUser;
import com.temp.repository.ApplicationUserRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {
    ApplicationUserRepository repository;

    public boolean login(String nric, String password) {
        ApplicationUser user = repository.findByNric(nric);
        if (user == null) {
            return false;
        }

        return user.getPassword().equals(password);
    }
}