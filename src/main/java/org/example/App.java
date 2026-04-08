package org.example;

/**
 * Hello world!
 *
 */
public class App
{


        public static void main(String[] args) {

            if (args.length == 0) {
                System.out.println("No arguments given.");
                return;
            }

            System.out.println("Names entered are:");

            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }