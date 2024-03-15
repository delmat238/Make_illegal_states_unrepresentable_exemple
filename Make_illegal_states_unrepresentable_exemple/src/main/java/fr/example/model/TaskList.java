package fr.example.model;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {

        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {

        tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
