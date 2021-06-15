package com.example.smartmenu.dto.recipe;

import com.example.smartmenu.dto.AbstractDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class ProductCharacteristicDTO extends AbstractDTO implements Serializable {
    private String name;
    private String value;
}
