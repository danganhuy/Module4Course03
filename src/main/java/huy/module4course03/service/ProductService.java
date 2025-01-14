package huy.module4course03.service;

import huy.module4course03.model.Product;

import java.util.*;

public class ProductService implements IProductService {
    private static final Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Product A", 50,"Description A", "A"));
        products.put(2, new Product(2,"Product B", 80,"Description B", "B"));
        products.put(3, new Product(3,"Product C", 70,"Description C", "C"));
        products.put(4, new Product(4,"Product D", 80,"Description D", "D"));
        products.put(5, new Product(5,"Product E", 90,"Description E", "E"));
        products.put(6, new Product(6,"Product F", 80,"Description F", "F"));
        products.put(7, new Product(7,"Product G", 120,"Description G", "G"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
