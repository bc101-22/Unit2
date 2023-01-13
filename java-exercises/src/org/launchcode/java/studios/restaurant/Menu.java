package studios.ch04;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    Date lastUpdated;
    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addItem(MenuItem item){
        items.add(item);
        lastUpdated = new Date();
    }

    // TODO: 1/12/2023
    public void removeItem(MenuItem item){
        
    }
}
