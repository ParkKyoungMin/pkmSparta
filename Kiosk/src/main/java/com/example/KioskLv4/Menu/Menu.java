package com.example.KioskLv4.Menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category; // 메뉴 카테고리 이름
    private List<MenuItem> menuItems; // MenuItem 리스트

    // 생성자
    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    // 메뉴 카테고리 이름 반환
    public String getCategory() {
        return category;
    }

    // MenuItem 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // MenuItem 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // MenuItem 리스트 출력
    public void displayMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %s | W %.2f | %s%n", i + 1, item.getName(), item.getPrice(), item.getDescription());
        }
    }
}
