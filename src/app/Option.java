package app;

public enum Option {
    EXIT(0, "Wyjscie z programu"),
    ADD_BOOKS(1, "Dodanie ksiazki"),
    ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),
    PRINT_BOOKS(3,"Wyswietlenie dostepnych ksiazek"),
    PRINT_MAGAZINES(4, "Wyswietlenie dostepnych magazynow/gazet");

    private int value;
    private String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    static Option createFromInt(int option){
        return Option.values()[option];
    }
}
