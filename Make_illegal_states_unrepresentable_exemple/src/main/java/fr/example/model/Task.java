package fr.example.model;

public class Task {
    private String description;
    private boolean completed;

    public Task(String description) throws IllegalArgumentException {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("La description ne peut pas être vide");
        }
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        if (!completed) {
            completed = true;
        } else {
            throw new IllegalStateException("La tâche est déjà complétée");
        }
    }
}