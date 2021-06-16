package com.example.smartmenu.controller;

import com.example.smartmenu.jooq.model.tables.pojos.Ingredient;
import com.example.smartmenu.jooq.model.tables.pojos.Recipe;
import com.example.smartmenu.service.RecipesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class ProductsController {
    private RecipesService recipesService;

    public ProductsController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @PostMapping("/getAllRecipes")
    public List<Recipe> getAllRecipes(@RequestBody List<String> ingredients) {
        return recipesService.getAllRecipes(ingredients);
    }
    @GetMapping("/getAllIngredients")
    public List<Ingredient> getAllIngredients(){
        return recipesService.getAllIngredients();
    }
}
