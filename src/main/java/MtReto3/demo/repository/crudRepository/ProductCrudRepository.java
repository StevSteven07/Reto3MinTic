
package MtReto3.demo.repository.crudRepository;

import MtReto3.demo.entities.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductCrudRepository extends CrudRepository<Product, Integer>{
    
}
