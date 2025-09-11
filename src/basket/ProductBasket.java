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

    // Метод для подсчета специальной продукции
    private long countSpecialProducts() {
        return products.values().stream()
                .flatMap(Collection::stream)
                .filter(Product::isSpecial)
                .count();
    }

    // Вывод корзины и подсчет спецтоваров
    public void printBasket() {
        System.out.println("Список товаров:");
        products.forEach((category, productList) -> {
            System.out.println("Категория: " + category);
            productList.forEach(product -> System.out.println("\\t" + product));
        });

        long specialCount = countSpecialProducts();
        System.out.println("Количество специальных товаров: " + specialCount);
    }

    // Новый метод для расчёта общей суммы товаров в корзине
    public double totalCost() {
        return products.values().stream()
                .flatMap(Collection::stream)
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
