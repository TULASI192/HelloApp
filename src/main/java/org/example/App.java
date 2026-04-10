package org.example;
public class App {
    public static void main(String[] args) {
        // Case 1: No arguments default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder for efficiency
        StringBuilder nameBuilder = new StringBuilder();

        // Append all names with ","
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        if (nameBuilder.length() > 0) {
            nameBuilder = new StringBuilder(
                    nameBuilder.substring(0, nameBuilder.length() - 2));
        }
    }
}