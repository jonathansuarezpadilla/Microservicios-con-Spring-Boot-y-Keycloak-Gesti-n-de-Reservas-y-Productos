package riwi.com.stockmicroservice.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import riwi.com.stockmicroservice.Entity.StockEntity;
import riwi.com.stockmicroservice.Repository.StockRepository;

import java.util.Optional;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    @RequestMapping("/{code}")
    public boolean stockAvailable(@PathVariable String code){
        Optional<StockEntity> stock = stockRepository.findByCode(code);

        stock.orElseThrow(()->new RuntimeException("Cannot find the product " + code));

        return stock.get().getQuantity() > 0;
    }


}
