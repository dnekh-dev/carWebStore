package dnekh.petProject.carWebStore.enums;

public enum TransmissionType {
    MANUAL("механический"), //manual transmission
    AUTOMATIC("автоматический"), //automatic transmission
    AMT("роботизированный"), //automated manual transmission (AMT) | dual-clutch transmission (DCT)
    CVT("вариатор"); //continuously variable transmission (CVT)

    private final String description;

    TransmissionType(String description) {
        this.description = description;
    }

    private String getDescription() {
        return description;
    }
}
