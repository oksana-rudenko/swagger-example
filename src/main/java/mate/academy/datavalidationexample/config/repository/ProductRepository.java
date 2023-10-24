package mate.academy.datavalidationexample.config.repository;

import mate.academy.datavalidationexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
