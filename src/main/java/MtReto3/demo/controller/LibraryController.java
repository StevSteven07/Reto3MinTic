
package MtReto3.demo.controller;

import MtReto3.demo.entities.Library;
import MtReto3.demo.entities.Product;
import MtReto3.demo.service.LibraryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Library")
public class LibraryController {
    
    @Autowired
    private LibraryService libraryService;
    
    @GetMapping("/all")
    public List<Library> getAll(){
       return libraryService.getAll();
    }
    @PostMapping("/save")
    public Library save(@RequestBody Library p){
        return libraryService.save(p);
    }
    
}
