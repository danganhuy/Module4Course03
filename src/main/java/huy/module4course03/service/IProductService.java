package huy.module4course03.service;

import huy.module4course03.model.Customer;
import huy.module4course03.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
