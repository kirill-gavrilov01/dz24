import product.Product;
import product.products;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        products.Products basket = new products.Products(); // Создаем экземпляр корзины

        // Добавляем товары в разные категории
        List<Product> foodItems = new ArrayList<>();
        foodItems.add(new Product("Молоко", false));
        foodItems.add(new Product("Сыр", true));
        foodItems.add(new Product("Хлеб", false));
        basket.addCategory("Еда", foodItems);

        List<Product> drinkItems = new ArrayList<>();
        drinkItems.add(new Product("Кофе", true));
        drinkItems.add(new Product("Чай", false));
        basket.addCategory("Напитки", drinkItems);

        // Печать содержимого корзины
        basket.printBasket();
    }
}

