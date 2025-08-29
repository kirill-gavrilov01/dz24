package basket;
import product.Product;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductBasket {
    private Map<String, List<Product>> products;

    public ProductBasket(Map<String, List<Product>> products) {
        this.products = products;
    }

    // Возвращает общую сумму всех товаров в корзине
    public int totalCost() {
        int sum = 0;
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                int string = Integer.parseInt(product.toString());
                sum += string;
            }
        }
        return sum;
    }

    // Подсчет специальных товаров
    private long countSpecialProducts() {
        long count;
        count = products.values().stream()
                .flatMap(Collection::stream)
                .filter(Product::isSpecial)
                .count();
        return count;
    }

    // Вывод корзины и подсчёт специальных товаров
    public void printBasket() {
        System.out.println("Список товаров:");
        products.forEach((category, productList) -> {
            System.out.println("Категория: " + category);
            productList.forEach(product -> System.out.println("\\t" + product));
        });

        long specialCount = countSpecialProducts();
        System.out.println("Количество специальных товаров: " + specialCount);
    }
}
