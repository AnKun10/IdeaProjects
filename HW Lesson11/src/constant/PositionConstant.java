package constant;

public enum PositionConstant {
    TOP("TOP"),
    JUNGLE("JUNGLE"),
    MID("MID"),
    ADC("ADC"),
    SUPPORT("SUPPORT");

    private String value;

    PositionConstant(String value) {
        this.value = value;
    }
}
