package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final List<Category> categories = new ArrayList<>();

    @GetMapping
    public List<Category> getAllCategories() {
        return categories;
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        categories.add(category);
        return category;
    }
}
