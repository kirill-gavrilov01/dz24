package app;

import basket.Basket;
import product.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        // Добавляем товары в корзину
        List<Product> foodItems = List.of(
                new Product("Молоко", 50.0, false),
                new Product("Сыр", 80.0, true),
                new Product("Хлеб", 30.0, false)
        );

        basket.addCategory("Еда", foodItems);

        // Подсчет общей стоимости товаров в корзине
        double totalCost = basket.calculateTotalCost();
        System.out.println("Общая стоимость продуктов: " + totalCost);

        // Количество специальных товаров
        long specialCount = basket.countSpecialProducts();
        System.out.println("Количество специальных товаров: " + specialCount);
    }
}