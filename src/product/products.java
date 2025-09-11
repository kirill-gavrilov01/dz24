package product;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class products {
    public static Collection<Object> values() {
        return null;
    }

    public static void forEach(Object o) {
    }

    public static class Products {
        private Map<String, List<Product>> categoriesToProducts = new HashMap<>();

        public void addCategory(String category, List<Product> products) {
            categoriesToProducts.put(category, products);
        }

        public Map<String, List<Product>> getCategoriesToProducts() {
            return categoriesToProducts;
        }

        public long countSpecialProducts() {
            return categoriesToProducts.values().stream()
                    .flatMap(List::stream)
                    .filter(Product::isSpecial)
                    .count();
        }

        public void printBasket() {
            System.out.println("Список товаров:");
            categoriesToProducts.forEach((category, productList) -> {
                System.out.println("Категория: " + category);
                productList.forEach(product -> System.out.println("\t" + product)); // Используем "\t" для отступа
            });

            long specialCount = countSpecialProducts();
            System.out.println("Количество специальных товаров: " + specialCount);
        }
    }
}