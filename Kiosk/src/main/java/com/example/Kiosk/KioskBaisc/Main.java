package com.example.Kiosk.KioskBaisc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 메뉴 항목 초기화

        Integer firestSelection = 1;
        while (firestSelection == 1 || firestSelection == 2 || firestSelection == 3) {
            Menu menuList = new Menu();
            System.out.println("쉑쉑버거에 오신 것을 환영합니다.\n 1. 매장 \n 2. 포장 \n 0. 종료하기");
            firestSelection = sc.nextInt();
            if (firestSelection == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (firestSelection == 1 || firestSelection == 2 || firestSelection == 3) {
                System.out.println("[ MAIN MENU ]");
                System.out.println("1.Burgers \n2.Drinks \n3.Desserts");
                Integer secondSelection = sc.nextInt();
                switch (secondSelection) {

                    case 1: {
                        //List <String> BurgersList = new ArrayList<>();
                        System.out.println("[ BURGERS MENU ]");
                        menuList.burgerList();
                        menuList.displayMenu();
                        System.out.println("0. 메인화면");
                        Integer thirdSelection = sc.nextInt();
                        if (thirdSelection == 0) {
                            break;
                        }
                        break;
                    }

                    case 2: {
                        System.out.println("[ DRINKS MENU ]");
                        menuList.drinkList();
                        menuList.displayMenu();
                             System.out.println("0. 메인화면");
                        Integer thirdSelection = sc.nextInt();
                        if (thirdSelection == 0) {
                            break;
                        }
                    }

                    case 3: {
                        System.out.println("[ DESSERTS MENU ]");
                        menuList.dessertList();
                        menuList.displayMenu();
                        System.out.println("0. 메인화면");
                        Integer thirdSelection = sc.nextInt();
                        if (thirdSelection == 0) {
                            break;
                        }
                    }
                    default: {
                        continue;
                    }
            }

            }

        }

    }
}

class  MenuItem {

    private String category;
    private String title;
    private String description;
    private double price;

    public MenuItem(String category, String title, Double price, String description) {

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

class Menu {
    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void burgerList() {
        // 메뉴 항목 추가
        addItem(new MenuItem("버거", "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        addItem(new MenuItem("버거", "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        addItem(new MenuItem("버거", "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        addItem(new MenuItem("버거", "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void drinkList() {
        // 음료 메뉴 항목 추가
        addItem(new MenuItem("음료","BaconMilkShake", 3.9, "우유와 베이컨을 갈아만든 밀크쉐이크"));
        addItem(new MenuItem("음료","ZeroCoke", 1.9, "설탕이 들어가지 않은 제로콜라"));
    }

    public void dessertList() {
        // 음료 메뉴 항목 추가
        addItem(new MenuItem("디져트","FrenchFries", 2.0, "소금과 기름으로 갓 튀겨낸 감자튀김"));
        addItem(new MenuItem("디져트","OnionRing", 4.0, "건강한 햇양파로 갓 튀겨낸 양파튀김"));

    }

    public void displayMenu() {
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            // 제목과 가격, 설명 사이의 간격 조정
            System.out.printf("%d. %-15s | W %-4.1f | %s%n", i + 1, item.getTitle(), item.getPrice(), item.getDescription());
        }
    }
}



//    private void MenuList(int i, MenuItem items) {
//        List<String> menuList = new ArrayList<>();
//        System.out.println("[ SHAKESHACK MENU ]");
//        MenuList (0, new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
//        //menu.addItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
//        //menu.addItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
//        //menu.addItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
//
//    }
//}


class Kiosk {

}