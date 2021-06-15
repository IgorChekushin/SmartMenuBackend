package com.example.smartmenu.dto.recipe;

import com.example.smartmenu.dto.AbstractDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class RecipeDTO extends AbstractDTO implements Serializable {
    private Integer id;
    private String name;
    private String[] imageURLs;
    private Integer price;
    private List<ProductCharacteristicDTO> shortProductCharacteristics;

}
