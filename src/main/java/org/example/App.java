package org.example;

public class App { // Class definition added here
    public static void main(String[] args) {
        // Default name
        String name = "World";

        // Check if a name is provided as a command-line argument
        // We check the length of the args array to avoid ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }

        System.out.println("Hello, " + name + "!");
    }
}