package fr.example;

import fr.example.model.Task;
import fr.example.model.TaskList;
import fr.example.model.ValidTask;

import java.util.Objects;

import static fr.example.model.Util.creerTask;
import static fr.example.model.Util.saisie;

public class Main {
    public static void main(String[] args) {

        String text;
        TaskList tasks = new TaskList();

        do {
            System.out.println("\n1. Creer une tache");
            System.out.println("2. Afficher les taches");
            System.out.println("3. Quitter");

            System.out.print("Faites votre choix : ");
            text = saisie();
            System.out.println();

            switch (text) {
                case "1":
                    System.out.print("saisissez la description de la tache : ");
                    Task task = creerTask(saisie());
                    tasks.addTask(task);
                    break;

                case "2":
                    for (ValidTask t : tasks.getTasks()) {
                        System.out.println(" - " + t.getDescription());
                    }
                    break;

                case "3":
                    System.out.println("Au revoir");
                    break;

                default:
                    System.out.println("Erreur apprenez à lire !");
                    break;

            }


        } while (!Objects.equals(text, "3"));

    }
}
