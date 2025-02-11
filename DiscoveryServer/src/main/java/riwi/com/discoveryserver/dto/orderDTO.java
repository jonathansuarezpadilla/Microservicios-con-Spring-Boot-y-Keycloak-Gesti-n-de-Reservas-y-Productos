package riwi.com.discoveryserver.dto;

import riwi.com.discoveryserver.Entity.OrderItem;

import java.util.List;

public class orderDTO {

    private List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public orderDTO() {
    }

    public orderDTO(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

}
