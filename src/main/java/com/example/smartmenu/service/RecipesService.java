package com.example.smartmenu.service;


import com.example.smartmenu.jooq.model.tables.pojos.Recipe;

import java.util.List;

public interface RecipesService {
    List<Recipe> getAllRecipes(List<String> ingredients);
}
