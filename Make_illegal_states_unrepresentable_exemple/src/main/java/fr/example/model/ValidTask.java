package fr.example.model;

public class ValidTask extends Task{
    private final String description;

    public ValidTask(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static boolean validDescription(String description) {
        return !(description == null || description.trim().isEmpty());
    }
}
