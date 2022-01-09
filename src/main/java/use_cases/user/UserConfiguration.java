package use_cases.user;

import kernel.Event;
import kernel.EventDispatcher;
import kernel.EventListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import use_cases.user.application.*;
import use_cases.user.domain.UserRepository;
import use_cases.user.infrastructure.DefaultEventDispatcher;
import use_cases.user.infrastructure.InMemoryUserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class UserConfiguration {

    @Bean
    public UserRepository userRepository() {
        return new InMemoryUserRepository();
    }

    @Bean
    public EventDispatcher<Event> eventEventDispatcher() {
        final Map<Class<? extends Event>, List<EventListener<? extends Event>>> listenerMap = new HashMap<>();
        listenerMap.put(CreateUserEvent.class, List.of(new CreateUserEventListener()));
        return new DefaultEventDispatcher(listenerMap);
    }
}
