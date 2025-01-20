package com.example.KioskLv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems; // MenuItem을 관리하는 리스트
    private Scanner scanner;

    // 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.scanner = new Scanner(System.in);
    }

    // 프로그램 시작 메서드
    public void start() {
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
