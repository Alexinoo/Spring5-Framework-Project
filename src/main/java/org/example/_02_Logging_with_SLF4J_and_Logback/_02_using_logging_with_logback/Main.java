package org.example._02_Logging_with_SLF4J_and_Logback._02_using_logging_with_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Using Logging with Logback
 */

public class Main {
    public final static Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        log.info("Hello Info");
        log.debug("Hello Debug");
    }
}
