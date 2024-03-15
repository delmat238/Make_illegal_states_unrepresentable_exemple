package fr.example.model;

import java.util.ArrayList;

public class TaskList {
    private final ArrayList<ValidTask> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        if (task instanceof ValidTask) {
            tasks.add((ValidTask) task);
        } else {
            System.out.println("impossible d'ajouter la tache la description n'est pas bonne");
        }
    }

    public ArrayList<ValidTask> getTasks() {
        return tasks;
    }
}
