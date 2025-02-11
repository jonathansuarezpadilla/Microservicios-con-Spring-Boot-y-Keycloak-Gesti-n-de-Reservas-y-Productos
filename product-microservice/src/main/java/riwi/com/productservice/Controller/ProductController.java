package riwi.com.productservice.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerMapping;
import riwi.com.productservice.Entity.ProductEntity;
import riwi.com.productservice.Repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;



    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

//
//    @GetMapping
//    @ResponseStatus
//    public ResponseEntity<List<ProductEntity>> getAllProduct() {
//
//        List<ProductEntity> productEntities = productRepository.findAll();
//        ResponseEntity<List<ProductEntity>> responseEntity= new ResponseEntity<>(productEntities,HttpStatus.OK)
//        return responseEntity;
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductEntity product) {
        System.out.println("Recibiendo producto: " + product);
        System.out.println("Nombre del producto: " + product.getProductName());
        System.out.println("Descripción del producto: " + product.getProductDescription());
        System.out.println("Precio unitario: " + product.getUnitPrice());
        productRepository.save(product);
        System.out.println("Producto guardado: " + product);
    }

}
