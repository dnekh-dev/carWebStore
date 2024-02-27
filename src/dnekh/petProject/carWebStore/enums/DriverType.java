package dnekh.petProject.carWebStore.enums;

public enum DriverType {
    FRONTWD("передний привод"), //front-wheel drive (FWD)
    REARWD("задний привод"), //rear-wheel drive (RWD)
    ALLWD("полный привод"), //all-wheel drive (AWD)
    FOURWD("постоянный полный привод"); //four-wheel drive (4WD or 4x4)

    private final String description;

    DriverType(String description) {
        this.description = description;
    }

    private String getDescription() {
        return description;
    }
}
