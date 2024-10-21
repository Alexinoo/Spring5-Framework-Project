package org.example._03_Multi_module_Spring_Project._24_code_cleanup_challenge;

/*
 * Code Cleanup Challenge
 *
 * Remove all bean methods from AppConfig class (GameImpl & MessageGeneratorImpl)
 *  - Then add @Component annotations on classes that were produced by these methods
 *
 * Use constructor injection/autowiring in classes GameImpl, MessageGeneratorImpl and ConsoleNumberGuess
 *
 * AppConfig will be an empty class (no methods) we can remove it and use GameConfig in Main class when creating
 *  the container
 *
 * Make sure the project is working the same as it was before adding these changes
 *
 * N/B
 *  - Be careful about annotations that you have to add to GameConfig after removing the AppConfig class
 */
public class Main {
}
