package riwi.com.stockmicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riwi.com.stockmicroservice.Entity.StockEntity;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<StockEntity,Long> {

    Optional<StockEntity> findByCode(String code);
}
