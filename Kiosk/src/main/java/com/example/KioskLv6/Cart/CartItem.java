package com.example.KioskLv6.Cart;

import com.example.KioskLv6.Menu.*;

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
