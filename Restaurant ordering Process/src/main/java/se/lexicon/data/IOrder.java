package se.lexicon.data;

import se.lexicon.model.Product;

public interface IOrder {

    int MAX_ITEMS= 10;

    Product[] getItems();
    default double calcPrice() {
        double total = 0;
        for (Product item : getItems()) {
            total += item.getPrice();
        }
        return total;

    }


    default double calcPriceWithTax(){
        double total = 0;
        for (Product item : getItems()) {
            total += item.getPrice() + item.calculateTaxes();
        }
        return total;
    }

    int numberOfItems();

    void addItem(Product item);
    void removeItem(Product item);

   default void displayItems(){
       int counter = 1;

        for (Product item: getItems()) {
            System.out.println("Order [" + counter++ + "].......");
            item.displayInfo();
        }
       System.out.println("###########");
       System.out.println("Total order cost:"+ calcPrice());
       System.out.println("Total order cost with Tax; " + calcPriceWithTax());

    }
}
