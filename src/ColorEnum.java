public enum ColorEnum {
    ORANGE("Оранжевий"),
    YELLOW("Жовтий"),
    GREEN("Зелений"),
    BLUE("Синій"),
    WHITE("Білий"),
    GOLD("Золотий");

    private String color;
    ColorEnum(String color) {
        this.color = color;
    }
    public String getColorName() {
        return color;
    }

}
