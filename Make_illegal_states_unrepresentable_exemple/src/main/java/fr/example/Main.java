package fr.example;

import fr.example.model.Task;
import fr.example.model.TaskList;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Task task1 = null;

        try {
            task1 = new Task("Faire les courses");
            taskList.addTask(task1);
            Task task2 = new Task("Payer les factures");
            taskList.addTask(task2);
            Task task3 = new Task(""); // Tâche avec une description vide, déclenchera une exception
            taskList.addTask(task3);

        } catch (IllegalArgumentException e) {
            System.out.println("La description d'une tache ne peut pas etre vide : " + e.getMessage());
        }

        for (Task task : taskList.getTasks()) {
            System.out.println(task.getDescription());
        }

        task1.markAsCompleted();
    }
}
