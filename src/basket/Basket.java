package basket;

import product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Basket {
    private Map<String, List<Product>> categories = new HashMap<>();

    public void addCategory(String category, List<Product> products) {
        categories.put(category, products);
    }

    // Расчёт общей стоимости через стримы
    public double calculateTotalCost() {
        return categories.values().stream()
                .flatMap(List::stream)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    // Подсчет количества специальных товаров
    public long countSpecialProducts() {
        return categories.values().stream()
                .flatMap(List::stream)
                .filter(Product::isSpecial)
                .count();
    }

    // Вывод содержимого корзины
    public void printBasket() {
        categories.forEach((category, products) ->
                System.out.println(category + ": " + products));
    }
}
