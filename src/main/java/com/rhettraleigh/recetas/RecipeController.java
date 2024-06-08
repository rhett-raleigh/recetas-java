package com.rhettraleigh.recetas;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private final RecipeRepository repository;

    RecipeController(RecipeRepository repository) {
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/recipes")
    List<Recipe> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @GetMapping("/recipes/{id}")
    Recipe one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RecipeNotFoundException(id));
    }

    @PostMapping("/recipes")
    Recipe newRecipe(@RequestBody Recipe newRecipe) {
        return repository.save(newRecipe);
    }

}
