package com.example.smartmenu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class DetailedProduct {
    private Integer id;
    private String name;
    private String[] imageURLs;
    private Integer price;

}
