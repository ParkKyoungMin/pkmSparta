package com.example.KioskLv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %s | W %.2f | %s%n", i + 1, item.getName(), item.getPrice(), item.getDescription());
            }
            System.out.println("0. 종료 | 종료");
            System.out.print("메뉴를 선택하세요: ");

            // 사용자 입력 처리
            choice = scanner.nextInt();

            // 선택된 메뉴에 따른 로직
            if (choice > 0 && choice <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(choice - 1);
                System.out.printf("선택한 메뉴: %s, 가격: W %.2f, 설명: %s%n",
                        selectedItem.getName(), selectedItem.getPrice(), selectedItem.getDescription());
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
            System.out.println(); // 줄 바꿈
        } while (choice != 0); // 0이 입력될 때까지 반복

        scanner.close(); // Scanner 자원 해제
    }
}

