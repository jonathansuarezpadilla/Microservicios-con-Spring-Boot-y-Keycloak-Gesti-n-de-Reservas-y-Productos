package riwi.com.productservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riwi.com.productservice.Entity.ProductEntity;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
