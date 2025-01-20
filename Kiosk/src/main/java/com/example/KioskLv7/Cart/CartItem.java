package com.example.KioskLv7.Cart;

import com.example.KioskLv7.Menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CartItem {
    private MenuItem menuItem; // 메뉴 항목
    private int quantity; // 수량

    public CartItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }
}
