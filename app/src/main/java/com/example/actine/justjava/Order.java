package com.example.actine.justjava;

/**
 * <p></p>
 *
 * @author Paul Danyliuk
 */
public class Order {

    private int numberOfCups;
    private boolean hasChocolate;
    private String customer;

    public static final int CUP_PRICE = 5;
    public static final int CHOCOLATE_PRICE = 1;

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public boolean isHasChocolate() {
        return hasChocolate;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public void increaseCups() {
        numberOfCups++;
    }
    public void decreaseCups() {
        numberOfCups--;
    }

    public void setHasChocolate(boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getPrice() {
        int price = numberOfCups * CUP_PRICE;
        if (hasChocolate) {
            price = price + CHOCOLATE_PRICE;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Order: " + numberOfCups + " cups" +
                "\nprice: $" + getPrice() + ".00";
    }
}
