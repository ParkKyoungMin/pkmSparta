package com.example.Kiosk.KioskLv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 메뉴 항목 초기화
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("버거", "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("버거", "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("버거", "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("버거", "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menuItems.add(new MenuItem("음료", "BaconMilkShake", 3.9, "우유와 베이컨을 갈아만든 밀크쉐이크"));
        menuItems.add(new MenuItem("음료", "ZeroCoke", 1.9, "설탕이 들어가지 않은 제로콜라"));
        menuItems.add(new MenuItem("디저트", "FrenchFries", 2.0, "소금과 기름으로 갓 튀겨낸 감자튀김"));
        menuItems.add(new MenuItem("디저트", "OnionRing", 4.0, "건강한 햇양파로 갓 튀겨낸 양파튀김"));

        // Kiosk 객체 생성 및 시작
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
    }
}

class MenuItem {
    private String category;
    private String title;
    private String description;
    private double price;

    public MenuItem(String category, String title, double price, String description) {
        this.category = category;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

class Kiosk {
    private List<MenuItem> menuItems;
    private Scanner sc;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.sc = new Scanner(System.in);
    }

    public void start() {
        Integer firstSelection = 1;
        while (true) {
            System.out.println("쉑쉑버거에 오신 것을 환영합니다.\n 1. 매장 \n 2. 포장 \n 0. 종료하기");
            firstSelection = sc.nextInt();
            if (firstSelection == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (firstSelection == 1 || firstSelection == 2) {
                showMainMenu();
            } else {
                System.out.println("유효하지 않은 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private void showMainMenu() {
        Integer secondSelection = 1;
        while (true) {
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Burgers \n2. Drinks \n3. Desserts \n0. 뒤로가기");
            secondSelection = sc.nextInt();
            switch (secondSelection) {
                case 1:
                    System.out.println("[ BURGERS MENU ]");
                    displayMenu("버거");
                    break;
                case 2:
                    System.out.println("[ DRINKS MENU ]");
                    displayMenu("음료");
                    break;
                case 3:
                    System.out.println("[ DESSERTS MENU ]");
                    displayMenu("디저트");
                    break;
                case 0:
                    return; // 메인 메뉴로 돌아가기
                default:
                    System.out.println("유효하지 않은 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private void displayMenu(String category) {
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals(category)) {
                System.out.printf("%s | W %-4.1f | %s%n", item.getTitle(), item.getPrice(), item.getDescription());
            }
        }
        System.out.println("0. 메인화면");
        int choice = sc.nextInt();
        if (choice == 0) {
            return; // 메인 화면으로 돌아가기
        }
    }
}