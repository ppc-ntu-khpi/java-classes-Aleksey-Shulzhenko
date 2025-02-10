package domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private double total;

    // Конструктор с дефолтными значениями
    public Customer() {
        this.ID = 1;   // Значение по умолчанию для ID
        this.isNew = true; // Значение по умолчанию для isNew
        this.total = 1000.0; // Значение по умолчанию для total
    }
}
