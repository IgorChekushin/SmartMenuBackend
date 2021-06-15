package com.example.smartmenu.repository.impl;

import com.example.smartmenu.repository.RecipesRepository;
import com.vorobev.onlineshop.jooq.model.Tables;
import com.vorobev.onlineshop.jooq.model.tables.pojos.Ingredient;
import com.vorobev.onlineshop.jooq.model.tables.pojos.Recipe;
import org.jooq.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipesRepositoryImpl implements RecipesRepository {
    private final DSLContext context;

    public RecipesRepositoryImpl(DSLContext context) {
        this.context = context;
    }


    @Override
    public List<Recipe> getAllRecipes() {
        return context.selectFrom(Tables.RECIPE).fetchInto(Recipe.class);
    }

    @Override
    public List<Ingredient> getIngredientsByRecipeId(Integer id) {
        List<Ingredient> result =  context.selectFrom(Tables.INGREDIENT).where(Tables.INGREDIENT.RECIPE__ID.equal(id)).fetchInto(Ingredient.class);
        return result;
    }
}
