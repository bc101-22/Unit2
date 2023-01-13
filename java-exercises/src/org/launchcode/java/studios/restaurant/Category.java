package studios.ch04;

public enum Category {
    APPETIZER("appetizer"),
    MAIN_COURSE("main course"),
    DESSERT("dessert");

    private final String displyName;

    Category(String displyName) {
        this.displyName = displyName;
    }

    public String getDisplyName(){
        return this.displyName;
    }
}
