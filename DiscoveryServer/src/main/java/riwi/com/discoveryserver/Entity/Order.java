package riwi.com.discoveryserver.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Petition")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNo;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Order() {
    }

    public Order(Long id, String orderNo, List<OrderItem> orderItems) {
        this.id = id;
        this.orderNo = orderNo;
        this.orderItems = orderItems;
    }
}
