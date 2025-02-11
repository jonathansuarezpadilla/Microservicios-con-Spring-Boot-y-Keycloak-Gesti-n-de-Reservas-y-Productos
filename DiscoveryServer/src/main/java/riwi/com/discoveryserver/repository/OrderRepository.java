package riwi.com.discoveryserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import riwi.com.discoveryserver.Entity.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
