package riwi.com.discoveryserver.Controller;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import riwi.com.discoveryserver.Client.StockClient;
import riwi.com.discoveryserver.Entity.Order;
import riwi.com.discoveryserver.dto.orderDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import riwi.com.discoveryserver.repository.OrderRepository;

import java.util.UUID;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private StockClient stockClient;

    @PostMapping("/order")
    @CircuitBreaker(name = "stock-microservice")
    public String savedOrder(@RequestBody orderDTO orderDto){

        // verificar si cada producto de la orden tiene stock disponible
        boolean inStock= orderDto.getOrderItems().stream()
                .allMatch(orderItem -> stockClient.stockAvailable(orderItem.getCode()));


        //verificando
        if(inStock){
            Order order = new Order();
            order.setOrderNo(UUID.randomUUID().toString());
            order.setOrderItems(orderDto.getOrderItems());

            orderRepository.save(order);

            return "Order Saved";
        }

        return "Order Cannot be Saved";

    }
}
