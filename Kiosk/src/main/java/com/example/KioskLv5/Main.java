package com.example.KioskLv5;

import com.example.KioskLv5.Menu.Menu;
import com.example.KioskLv5.Menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 메뉴 항목 생성
        List<Menu> menus = new ArrayList<>();

        // Burgers 메뉴 생성
        Menu burgersMenu = new Menu("Burgers");
        burgersMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menus.add(burgersMenu);

        // Drinks 메뉴 생성
        Menu drinksMenu = new Menu("Drinks");
        drinksMenu.addMenuItem(new MenuItem("Coke", 1.5, "탄산음료"));
        drinksMenu.addMenuItem(new MenuItem("Sprite", 1.5, "레몬 라임 맛의 탄산음료"));
        drinksMenu.addMenuItem(new MenuItem("Lemonade", 2.0, "상큼한 레모네이드"));
        menus.add(drinksMenu);

        // Desserts 메뉴 생성
        Menu dessertsMenu = new Menu("Desserts");
        dessertsMenu.addMenuItem(new MenuItem("Cheesecake", 4.5, "부드러운 치즈케이크"));
        dessertsMenu.addMenuItem(new MenuItem("Brownie", 3.5, "초콜릿 브라우니"));
        dessertsMenu.addMenuItem(new MenuItem("Ice Cream", 2.5, "바닐라 아이스크림"));
        menus.add(dessertsMenu);

        // Kiosk 객체 생성 및 시작
        Kiosk kiosk = new Kiosk(menus);
        kiosk.start(); // 프로그램 시작
    }
}
