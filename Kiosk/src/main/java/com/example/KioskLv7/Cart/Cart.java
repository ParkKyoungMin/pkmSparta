package com.example.KioskLv7.Cart;

import com.example.KioskLv7.Menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    private List<CartItem> items; // 장바구니 항목 리스트

    public Cart() {
        items = new ArrayList<>();
    }

    // 장바구니에 항목 추가
    public void addItem(MenuItem menuItem, int quantity) {
        items.add(new CartItem(menuItem, quantity));
    }

    // 특정 메뉴 항목 제거
    public void removeItem(String itemName) {
        items = items.stream()
                .filter(item -> !item.getMenuItem().getName().equalsIgnoreCase(itemName))
                .collect(Collectors.toList());
    }

    // 장바구니 출력 및 총 금액 계산
    public void displayCart() {
        System.out.println("[ Orders ]");
        double total = 0;
        for (CartItem item : items) {
            System.out.printf("%s | W %.2f | 수량: %d%n",
                    item.getMenuItem().getName(),
                    item.getMenuItem().getPrice(),
                    item.getQuantity());
            total += item.getMenuItem().getPrice() * item.getQuantity();
        }
        System.out.printf("[ Total ] W %.2f%n", total);
    }

    // 장바구니 비우기
    public void clear() {
        items.clear();
    }

    // 장바구니가 비어있는지 확인
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // 장바구니 항목 수 가져오기
    public List<CartItem> getItems() {
        return items;
    }
}
