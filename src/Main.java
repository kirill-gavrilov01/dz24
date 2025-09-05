import basket.Basket;
import product.Product;
import product.products;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        // Добавляем продукты в корзину
        List<Product> foodItems = List.of(
                new Product("Молоко", 50.0, false),
                new Product("Сыр", 80.0, true),
                new Product("Хлеб", 30.0, false)
        );
    }
}
