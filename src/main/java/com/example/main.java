package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main application class for Jenkins Java Project
 */
public class Main {
    
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("Starting Jenkins Java Project...");
        
        Main app = new Main();
        app.run();
        
        logger.info("Application completed successfully!");
    }
    
    public void run() {
        System.out.println("Hello from Jenkins Java Project!");
        System.out.println("This is a simple Java application for CI/CD demonstration.");
        
        // Example of some basic functionality
        Calculator calc = new Calculator();
        
        int result1 = calc.add(10, 5);
        int result2 = calc.subtract(10, 5);
        int result3 = calc.multiply(10, 5);
        int result4 = calc.divide(10, 5);
        
        System.out.println("Calculator Results:");
        System.out.println("10 + 5 = " + result1);
        System.out.println("10 - 5 = " + result2);
        System.out.println("10 * 5 = " + result3);
        System.out.println("10 / 5 = " + result4);
    }
    
    public String getGreeting() {
        return "Hello from Jenkins Java Project!";
    }
}
