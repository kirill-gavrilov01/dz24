package product;

public class Product implements Searchable {
    private String name;
    private double price;
    private boolean special;

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
    public boolean matches(String query) {
        return name.contains(query);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\\';
    }
}
