package com.codenotfound.graphql.resolver;

import org.springframework.stereotype.Component;

import com.codenotfound.model.Greeting;
import com.codenotfound.repository.GreetingRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver {

  private GreetingRepository greetingRepository;

  public Mutation(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  public Greeting newGreeting(String message) {
    Greeting greeting = new Greeting();
    greeting.setMessage(message);

    return greetingRepository.save(greeting);
  }
}
