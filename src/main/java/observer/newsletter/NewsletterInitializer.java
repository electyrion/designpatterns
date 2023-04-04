package id.ac.ui.cs.advprog.tutorial1.newsletter;

import id.ac.ui.cs.advprog.tutorial1.newsletter.core.Newsletter;
import id.ac.ui.cs.advprog.tutorial1.newsletter.core.User;
import id.ac.ui.cs.advprog.tutorial1.newsletter.repository.NewsletterRepository;
import id.ac.ui.cs.advprog.tutorial1.newsletter.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewsletterInitializer {

    @Autowired
    UserRepository userRepository;
    @Autowired
    NewsletterRepository newsletterRepository;

    @PostConstruct
    public void init() {
        // initialize users
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        // add users to repository
        userRepository.addUser(alice.getName(), alice);
        userRepository.addUser(bob.getName(), bob);
        userRepository.addUser(charlie.getName(), charlie);

        // initialize newsletters
        Newsletter sport = new Newsletter("BI Sports");
        Newsletter travel = new Newsletter("Koped Travel");
        Newsletter game = new Newsletter("GameStart");

        // add newsletters to repository
        newsletterRepository.addNewsletter(sport.getName(), sport);
        newsletterRepository.addNewsletter(travel.getName(), travel);
        newsletterRepository.addNewsletter(game.getName(), game);

    }

    /*
     * Spring Dependency Injection (DI) is a design pattern and a core concept in
     * the Spring framework that allows the creation of loosely coupled
     * applications. DI enables you to develop components that can be easily
     * integrated and tested in isolation from other components.
     * 
     * In a Spring-based application, the DI framework provides the necessary
     * objects (known as beans) to an object when it needs them. Instead of having
     * to create and manage object dependencies yourself, you can declare them as
     * part of the object definition, and let the Spring container manage them.
     * 
     * There are three types of dependency injection supported by the Spring
     * framework:
     * 
     * Constructor injection: dependencies are passed to a class through its
     * constructor.
     * Setter injection: dependencies are set via a setter method.
     * Field injection: dependencies are set directly into the class field.
     * By using DI, you can create components that are decoupled from their
     * dependencies, making them easier to test, maintain, and refactor. Spring
     * makes it easy to configure and manage these dependencies through its powerful
     * and flexible DI framework.
     */
}
