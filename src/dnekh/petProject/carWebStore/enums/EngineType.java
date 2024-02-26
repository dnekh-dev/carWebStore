package dnekh.petProject.carWebStore.enums;

public enum EngineType {
    GASOLINE("бензин"),
    DIESEL("дизель"),
    LPG("газ"),
    HYBRID("гибрид"),
    ELECTRIC("электрический");

    private final String description;

    EngineType(String description) {
        this.description = description;
    }

    private String getDescription() {
        return description;
    }
}
