package com.example.KioskLv2;

public class MenuItem {
    private String name; // 메뉴 이름
    private double price; // 가격
    private String description; // 설명

    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // getter 메서드
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
