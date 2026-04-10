package org.example;

public class App {
    public static void main(String[] args) {
        // If no arguments provided, print default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }
        // Build comma-separated names using StringBuilder
        StringBuilder namesBuilder = new StringBuilder();
        boolean first = true;
        for (String name: args) {
            if (!first) {
                namesBuilder.append(", ");
            }
            namesBuilder.append(name);
            first = false;
        }
    }
}
