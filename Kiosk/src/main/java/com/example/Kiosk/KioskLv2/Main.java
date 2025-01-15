package com.example.Kiosk.KioskLv2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();

        // 햄버거 메뉴 항목 추가
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Integer firestSelection = 1;
        while (firestSelection == 1 || firestSelection == 2 || firestSelection == 3) {
            System.out.println("쉑쉑버거에 오신 것을 환영합니다.\n 1. 매장 \n 2. 포장 \n 0. 종료하기");
            firestSelection = sc.nextInt();
            if (firestSelection == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (firestSelection == 1 || firestSelection == 2) {
                System.out.println("[ MAIN MENU ]");
                System.out.println("1.Burgers \n2.Drinks \n3.Desserts");
                Integer secondSelection = sc.nextInt();
                switch (secondSelection) {
                    case 1: {
                        System.out.println("[ BURGERS MENU ]");
                        displayMenu(menuItems);
                        System.out.println("0. 메인화면");
                        Integer thirdSelection = sc.nextInt();
                        if (thirdSelection == 0) {
                            break;
                        }
                        break;
                    }
                    // 음료와 디저트 메뉴는 추가 구현이 필요합니다.
                    default: {
                        continue;
                    }
                }
            }
        }
    }

    public static void displayMenu(List<MenuItem> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %-15s | W %-4.1f | %s%n", i + 1, item.getTitle(), item.getPrice(), item.getDescription());
        }
    }
}

class MenuItem {
    private String title;
    private double price;
    private String description;

    public MenuItem(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
