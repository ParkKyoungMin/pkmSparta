package com.example.KioskLv5;

import com.example.KioskLv5.Menu.Menu;
import com.example.KioskLv5.Menu.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus; // Menu 리스트
    private Scanner scanner;

    // 생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.scanner = new Scanner(System.in);
    }

    // 프로그램 시작 메서드
    public void start() {
        int choice;
        do {
            // 메인 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, menus.get(i).getCategory());
            }
            System.out.println("4. 관리하기");
            System.out.println("0. 종료 | 종료");
            System.out.print("메뉴를 선택하세요: ");

            // 사용자 입력 처리
            choice = scanner.nextInt();

            // 선택된 메뉴에 따른 로직
            if (choice > 0 && choice <= menus.size()) {
                Menu selectedMenu = menus.get(choice - 1);
                System.out.printf("[ %s MENU ]%n", selectedMenu.getCategory());
                selectedMenu.displayMenuItems();

                System.out.println("0. 뒤로가기");
                int itemChoice = scanner.nextInt();
                if (itemChoice > 0 && itemChoice <= selectedMenu.getMenuItems().size()) {
                    MenuItem selectedItem = selectedMenu.getMenuItems().get(itemChoice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.2f | %s%n",
                            selectedItem.getName(), selectedItem.getPrice(), selectedItem.getDescription());
                } else if (itemChoice == 0) {
                    System.out.println("뒤로가기...");
                } else {
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                }
            } else if (choice == 4) { // 관리하기 기능
                manageMenu();
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
            System.out.println(); // 줄 바꿈
        } while (choice != 0); // 0이 입력될 때까지 반복

        scanner.close(); // Scanner 자원 해제
    }

    // 메뉴 관리 기능 추가
    private void manageMenu() {
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.next();
        if ("1234".equals(password)) {
            System.out.println("관리 모드에 들어갑니다.");
            System.out.println("수정할 메뉴의 카테고리를 선택하세요:");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, menus.get(i).getCategory());
            }
            int categoryChoice = scanner.nextInt();
            if (categoryChoice > 0 && categoryChoice <= menus.size()) {
                Menu selectedMenu = menus.get(categoryChoice - 1);
                selectedMenu.displayMenuItems();
                System.out.print("수정할 메뉴 항목의 번호를 입력하세요: ");
                int itemChoice = scanner.nextInt();
                if (itemChoice > 0 && itemChoice <= selectedMenu.getMenuItems().size()) {
                    MenuItem selectedItem = selectedMenu.getMenuItems().get(itemChoice - 1);

                    // 수정할 항목의 이름, 가격, 설명 입력받기
                    System.out.print("새로운 이름을 입력하세요 (현재: " + selectedItem.getName() + "): ");
                    String newName = scanner.next();
                    selectedItem.setName(newName);

                    System.out.print("새로운 가격을 입력하세요 (현재: " + selectedItem.getPrice() + "): ");
                    double newPrice = scanner.nextDouble();
                    selectedItem.setPrice(newPrice);

                    System.out.print("새로운 설명을 입력하세요 (현재: " + selectedItem.getDescription() + "): ");
                    String newDescription = scanner.next();
                    selectedItem.setDescription(newDescription);

                    System.out.println("메뉴 항목이 수정되었습니다.");
                } else {
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                }
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        } else {
            System.out.println("비밀번호가 틀립니다.");
        }
    }
}