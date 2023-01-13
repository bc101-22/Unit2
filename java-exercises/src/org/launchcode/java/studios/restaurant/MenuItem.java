package studios.ch04;

public class MenuItem {
    private float price;
    private String description;
    private Category category;
    private boolean isNew;

    public MenuItem(float price, String description, Category category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public float getPrice() {
        return price;
    }

    private void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    private void setCategory(Category category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    private void setNew(boolean aNew) {
        isNew = aNew;
    }
}
