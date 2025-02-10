package domain;

public class Customer {
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000.0;

    public Customer() {
    }

    // Геттери для доступу до атрибутів
    public int getID() {
        return ID;
    }

    public boolean isNew() {
        return isNew;
    }

    public double getTotal() {
        return total;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is new customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
