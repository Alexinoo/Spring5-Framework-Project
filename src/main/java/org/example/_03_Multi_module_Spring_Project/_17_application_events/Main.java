package org.example._03_Multi_module_Spring_Project._17_application_events;

/*
 * Application Events
 *
 * Create ConsoleNumberGuess class to console module
 * Need to be scanned by the container - annotate it
 *
 * Two ways
 *  - Implement ApplicationListener interface
 *  - Use EventListener annotation and add it to the method that is going to be executed once the event gets fired
 *
 *  - to see the latter in action
 *      - remove implements clause
 *      - add an @EventListener annotation
 *          - we can now rename the method to what we want doesn't have to be: onApplicationEvent
 *          - rename it to start(ContextRefreshedEvent event)
 *      - the parameter "ContextRefreshedEvent event" determines the type of the event
 *          - mandatory for the EventListener start() - throws an error if excluded
 *
 *      - alternatively, we can ignore to pass it to the start() but pass it as a class to our event listener annotation
 *          @EventListener(ContextRefreshedEvent.class)
 *          - and this works as well
 *          - this is an alternative way of achieving the same thing
 */
public class Main {
}
