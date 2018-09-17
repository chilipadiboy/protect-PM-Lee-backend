package com.temp.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.temp.model.ApplicationUser;
import com.temp.repository.ApplicationUserRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    private ApplicationUserRepository applicationUserRepository;

    public boolean register(String nric, String password) {
        ApplicationUser user = new ApplicationUser();
        user.setNric(nric);
        user.setPassword(password);
        applicationUserRepository.save(user);
        return true;
    }
}