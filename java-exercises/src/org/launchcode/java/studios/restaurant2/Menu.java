package studios.ch05;

import java.util.Date;
import java.util.List;
import java.util.Set;

// Menu consists of sveral menu items
// Each menu item has a price, description, and category(appetizer, main course, dessert)
// Be able to display whether a menu item is new
// Keep track of when the menu was last updated

// Instance methods:
// Add / remove menu items from the menu
// If a menu item is new
// When the menu was last updated
// Print out single menu item / entire menu
// Determine whether two menu items are equal

public class Menu {
    private List<MenuItem> items;
    Date dateUpdated;
    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public void addMenuItem(MenuItem item){
        if(items.contains(item)) {
            System.out.println("The menu item you are trying to add already exists.");
        }
        else {
            items.add(item);
            dateUpdated = new Date();
        }
    }

    public void removeMenuItem(MenuItem item){
        if(items.contains(item)){
            items.remove(item);
        }
    }
    
    Date lastUpdated() {
        return this.dateUpdated;
    }

    public void printFullMenu() {
         for (MenuItem i : items) {
             System.out.println(i);
         }
    }

    public void printMenuItem(MenuItem item) {
        System.out.println(item);
    }

    @Override
    public String toString() {
        String menu = "";
        for (MenuItem i : items) {
            menu = menu + i + "\n"; //TODO: check if explicit toString() is needed
        }
        return menu;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
