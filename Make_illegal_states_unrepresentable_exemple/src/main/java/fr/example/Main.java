package fr.example;
import fr.example.model.Task;
import fr.example.model.TaskList;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        Task task1 = new Task("Faire les courses");
        Task task2 = new Task("Payer les factures");
        Task task3 = new Task(""); // Tâche avec une description vide, déclenchera une exception

        taskList.addTask(task1);
        taskList.addTask(task2);

        // Ajout de la tâche avec une description vide, provoquant une exception
        try {
            taskList.addTask(task3);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur lors de l'ajout de la tâche: " + e.getMessage());
        }

        for (Task task : taskList.getTasks()) {
            System.out.println(task.getDescription());
        }

        task1.markAsCompleted();
        // task1.markAsCompleted(); // Si vous décommentez cette ligne, une exception sera déclenchée
    }
}