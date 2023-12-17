package se.lexicon;

import se.lexicon.data.Order;
import se.lexicon.model.Burger;
import se.lexicon.model.CheeseType;
import se.lexicon.model.Drink;
import se.lexicon.model.Fries;

public class Main {
    public static void main(String[] args)
    {
        Burger chesseBurger = new Burger("chesseBurger",99.00,"Veggi");
        chesseBurger.displayInfo();

        System.out.println("---------------");
        Drink cola = new Drink("cola",19,"medium");
        cola.displayInfo();

        System.out.println("---------------");
        Fries friesWithCheese = new Fries("Fries",10, CheeseType.GODA);
        Fries friesWithChilliCheese = new Fries("Fries",10,CheeseType.CHILI_CHEESE);
        Fries friesWithoutCheese = new Fries("fries",10,CheeseType.WITHOUT_CHEESE);

        friesWithCheese.displayInfo();
        friesWithoutCheese.displayInfo();
        friesWithChilliCheese.displayInfo();
        System.out.println("cola.calculateTaxes() = " + cola.calculateTaxes());
        System.out.println("friesWithoutCheese = " + chesseBurger.calculateTaxes());

        System.out.println("----Order-----");

        Order ManpritFirstOrder = new Order();
        ManpritFirstOrder.addItem(friesWithCheese);
        ManpritFirstOrder.addItem(chesseBurger);
        ManpritFirstOrder.addItem(friesWithCheese);
        ManpritFirstOrder.displayItems();


    }
}