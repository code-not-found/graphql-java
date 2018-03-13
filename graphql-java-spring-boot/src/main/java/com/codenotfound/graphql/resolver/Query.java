package com.codenotfound.graphql.resolver;

import org.springframework.stereotype.Component;

import com.codenotfound.model.Greeting;
import com.codenotfound.repository.GreetingRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

  private GreetingRepository greetingRepository;

  public Query(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  public Greeting getGreeting(String id) {
    return greetingRepository.find(id);
  }
}
