package studios.ch05;

import jdk.jfr.Category;

import java.sql.Array;
import java.util.*;

public class Restaurant {
    public static void main(String[] args){
        MenuItem item1 = new MenuItem(10.0, "spaghetti", "main course", new Date());
        MenuItem item2 = new MenuItem(3.0, "ice cream", "dessert", new Date());
        List<MenuItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        Menu menu = new Menu(items);
//        System.out.println(menu);
//        menu.printFullMenu();
//        menu.printMenuItem(item1);
        MenuItem item3 = new MenuItem(3.0, "hot wings", "appetizer", new Date(0));
        MenuItem item33 = new MenuItem(3.0, "hot wings", "appetizer", new Date(0));
        MenuItem item333 = new MenuItem(3.33, "hot wings", "appetizer", new Date(0));

//        menu.addMenuItem(item3);
//        menu.printFullMenu();
//
//        menu.removeMenuItem(item3);
//        menu.printFullMenu();
//        System.out.println(item3.isNew(menu.dateUpdated));

//        menu.addMenuItem(item1); // expect the repetitive item to be rejected
//        menu.printFullMenu();
//        System.out.println();

        System.out.println("----------");
        menu.printFullMenu();
        menu.addMenuItem(item3);

        System.out.println("----------");
        menu.printFullMenu();
        menu.addMenuItem(item33); // expect the repetitive item to be rejected

        System.out.println("----------");
        menu.printFullMenu();
        System.out.println(String.format("identity: %b", item3 == item33));
        System.out.println(String.format("equality: %b", item3.equals(item33)));
        System.out.println();

        System.out.println("----------");
        menu.addMenuItem(item333);
        menu.printFullMenu();
        System.out.println(String.format("identity: %b", item3 == item333));
        System.out.println(String.format("equality: %b", item3.equals(item333)));
        System.out.println();

        MenuItem item4 = new MenuItem(10.0, "sandwich", "main course", new Date(0));
        System.out.println(item4.isNew(menu.dateUpdated));
    }
}
