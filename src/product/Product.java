package product;

public class Product {
    private final String name;
    private final double price;
    private final boolean special;

    public Product(String name, double price, boolean special) {
        this.name = name;
        this.price = price;
        this.special = special;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSpecial() {
        return special;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\\';
    }
}