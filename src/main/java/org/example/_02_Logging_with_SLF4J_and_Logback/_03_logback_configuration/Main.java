package org.example._02_Logging_with_SLF4J_and_Logback._03_logback_configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Logback Configuration
 */
public class Main {

    private final static Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("Hello Info");
        log.debug("Hello Debug");
    }
}
