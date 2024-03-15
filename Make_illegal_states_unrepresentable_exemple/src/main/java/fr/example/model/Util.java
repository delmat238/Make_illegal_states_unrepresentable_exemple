package fr.example.model;

import java.util.Scanner;

public class Util {

    public static String saisie() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static Task creerTask(String description)  {
        if (validDescription(description)) {
            return new ValidTask(description);
        }
        return new Task();
    }

    public static boolean validDescription(String description) {
        return !(description == null || description.trim().isEmpty());
    }

}
