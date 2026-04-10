package org.example;

public class App {
    public static void main(String[] args) {
        String name;

        // Check if any arguments are passed
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            // Loop through all arguments
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                // Add comma and space if not the last element
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        } else {
            // Default value if no arguments are provided
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}
