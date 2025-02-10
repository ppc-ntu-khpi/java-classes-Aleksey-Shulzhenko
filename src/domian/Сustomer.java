package domain;

public class Customer {
    // Приватні атрибути з значеннями за замовчуванням
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000.0;

    // Конструктор без параметрів, значення за замовчуванням
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

    // Метод для виведення інформації про клієнта
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is new customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
