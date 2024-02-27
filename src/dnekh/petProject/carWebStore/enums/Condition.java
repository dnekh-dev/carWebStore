package dnekh.petProject.carWebStore.enums;

public enum Condition {
    NEW("новый"),
    USED("подержанный");

    private final String description;

    Condition(String description) {
        this.description = description;
    }

    private String getDescription() {
        return description;
    }
}
