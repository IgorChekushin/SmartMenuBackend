package com.example.smartmenu.service.impl;

import com.example.smartmenu.jooq.model.tables.pojos.Recipe;
import com.example.smartmenu.repository.RecipesRepository;
import com.example.smartmenu.service.RecipesService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RecipesServiceImpl implements RecipesService {
    private final RecipesRepository recipesRepository;

    public RecipesServiceImpl(RecipesRepository recipesRepository) {
        this.recipesRepository = recipesRepository;
    }

    @Override
    public List<Recipe> getAllRecipes(List<String> ingredients) {
        List<Recipe> recipes = recipesRepository.getAllRecipes();
        return recipes.stream().filter(r -> {
            return ingredients.containsAll(recipesRepository.getIngredientsByRecipeId(r.getId()).stream().map(i -> i.getName()).collect(Collectors.toList()));
        }).collect(Collectors.toList());
    }
}
