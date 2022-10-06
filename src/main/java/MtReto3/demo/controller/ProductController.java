
package MtReto3.demo.controller;

import MtReto3.demo.entities.Product;
import MtReto3.demo.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Product")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping("/all")
    public List<Product> getAll(){
       return productService.getAll();
    }
    @PostMapping("/save")
    public Product save(@RequestBody Product p){
        return productService.save(p);
    }
    
}
