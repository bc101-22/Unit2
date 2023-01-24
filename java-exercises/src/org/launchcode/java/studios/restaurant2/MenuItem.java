package studios.ch05;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem(double price, String description, String category, Date dateAdded) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    public Date dateAdded() {
        return dateAdded;
    }

    private void setNew(Date aDateAdded) {
        dateAdded = aDateAdded;
    }

    public boolean isNew(Date DateUpdated) {
        return this.dateAdded.compareTo(DateUpdated) >= 0;
    }

    public String toString() {
        return String.format("%s - %s | %.2f", this.description, this.category, this.price);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        MenuItem toBeCompared = (MenuItem) other;
        return (this.dateAdded.equals(toBeCompared.dateAdded)) &&
                (this.description == toBeCompared.description) &&
                (this.category == toBeCompared.category) &&
                (this.price == toBeCompared.price);
    }
}