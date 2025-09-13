package stock.management.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stock.management.api.dto.CategoryDTO;
import stock.management.api.model.Category;
import stock.management.api.repository.CategoryRepository;

@RestController
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private CategoryRepository repository;

    @PostMapping
    public void register(@RequestBody CategoryDTO category){
        repository.save(new Category(category));
    }
}
