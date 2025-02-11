package riwi.com.stockmicroservice.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="stock")
public class StockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private Integer quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public StockEntity() {
    }

    public StockEntity(Long id, String code, Integer quantity) {
        this.id = id;
        this.code = code;
        this.quantity = quantity;
    }
}
