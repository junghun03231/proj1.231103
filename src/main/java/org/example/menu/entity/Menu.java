package org.example.menu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Menu {
    private int menuId;
    private String menuName;
    private int menuPrice;
    private int ice;
    private int syrup;

    //public Menu(int menuId, String menuName, int menuPrice, int ice, int syrup) {
     
    // }

}
