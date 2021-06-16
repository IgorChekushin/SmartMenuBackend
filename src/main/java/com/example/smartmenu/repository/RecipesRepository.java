package com.example.smartmenu.repository;


import com.example.smartmenu.jooq.model.tables.pojos.Ingredient;
import com.example.smartmenu.jooq.model.tables.pojos.Recipe;

import java.util.List;

public interface RecipesRepository {
    List<Recipe> getAllRecipes();
    List<Ingredient> getIngredientsByRecipeId(Integer id);
    List<Ingredient> getAllIngredients();
}
