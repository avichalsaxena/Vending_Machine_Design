package vending;

public enum Item {
    CANDY("Candy", 10), COKE("Coke", 25), NUTS("Nuts", 90), PEPSI("Pepsi", 35), SNACK("Snack", 50),
    GINGERALE("Gingerale", 45);
    private String name;
    private int price;

    private Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

}
