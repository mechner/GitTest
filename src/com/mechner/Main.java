package com.mechner;

import com.mechner.logging.Logger;
import com.mechner.logging.SimpleLogger;

import static com.mechner.logging.Formatting.fmt;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hellow.");

        Logger logger = new SimpleLogger();
        logger.log("A number: {}", fmt(42));
    }
}
