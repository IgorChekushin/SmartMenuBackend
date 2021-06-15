package com.example.smartmenu.dto.recipe;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class DetailedRecipeDTO extends RecipeDTO implements Serializable {
    private List<String> productFunctions;
    private List<ProductCharacteristicDTO> productCharacteristics;

    public DetailedRecipeDTO(Integer id,
                             String name,
                             String[] imageURLs,
                             Integer price,
                             List<ProductCharacteristicDTO> shortProductCharacteristics,
                             List<String> productFunctions,
                             List<ProductCharacteristicDTO> productCharacteristics) {
        super(id, name, imageURLs, price, shortProductCharacteristics);
        this.productFunctions = productFunctions;
        this.productCharacteristics = productCharacteristics;
    }
}
