package org.example._05_Spring_MVC._11_simple_service_challenge;
/*
 * Simple Service Challenge
 *
 * Create an interface called DemoService with a method named getHelloMessage() that has a String parameter
 *  called user
 *
 * Create another method named getWelcomeMessage() without parameters
 *
 * Both methods should return a String
 *
 *
 * ///
 * Create a class called DemoServiceImpl and annotate it with the @Service annotation
 *
 * DemoServiceImpl class needs to implement the DemoService interface, and within the class,
 *  - getHelloMessage() should return the String "Hello" + user ,
 *  - and the getWelcomeMessage() should return the String "Welcome to this Demo Application"
 * Those 2 methods are defined in the DemoService interface
 *
 * In DemoController inject/autowire DemoService using constructor injection
 *
 * In the controller methods, use DemoService to add attributes to the model instead of using strings
 * In other words, call the service methods to get messages that are used as model attributes and displayed by
 *  the JSP page
 *
 * You have to remove the user model attribute in the welcome() controller method and use another attribute instead
 * The value for the attribute should come from calling getHelloMessage() from DemoService
 *
 * Modify welcome.jsp file to use the new model attribute name instead of user
 */
public class Main {
}
