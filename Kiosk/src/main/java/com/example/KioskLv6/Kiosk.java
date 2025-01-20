package com.example.KioskLv6;

import com.example.KioskLv6.Menu.*;
import com.example.KioskLv6.Cart.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus; // Menu 리스트
    private Scanner scanner;
    private Cart cart; // 장바구니

    // 생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.scanner = new Scanner(System.in);
        this.cart = new Cart(); // 장바구니 초기화
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
            System.out.println("4. Orders | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel | 진행중인 주문을 취소합니다.");
            System.out.println("0. 종료    | 종료");

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

                    // 장바구니에 추가할지 물어보기
                    System.out.print("위 메뉴를 장바구니에 추가하시겠습니까?\n1. 확인  2. 취소\n");
                    int addChoice = scanner.nextInt();
                    if (addChoice == 1) {
                        System.out.print("수량을 입력하세요: ");
                        int quantity = scanner.nextInt();
                        cart.addItem(selectedItem, quantity);
                        System.out.printf("%s 이(가) 장바구니에 추가되었습니다.%n", selectedItem.getName());
                    }
                } else if (itemChoice == 0) {
                    System.out.println("뒤로가기...");
                } else {
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                }
            } else if (choice == 4) { // 주문하기
                if (cart.isEmpty()) {
                    System.out.println("장바구니에 항목이 없습니다.");
                } else {
                    cart.displayCart();
                    System.out.print("1. 주문  2. 메뉴판\n");
                    int orderChoice = scanner.nextInt();
                    if (orderChoice == 1) {
                        double total = 0;
                        for (CartItem item : cart.getItems()) {
                            total += item.getMenuItem().getPrice() * item.getQuantity();
                        }
                        System.out.printf("주문이 완료되었습니다. 금액은 W %.2f 입니다.%n", total);
                        cart.clear(); // 주문 후 장바구니 비우기
                    }
                }
            } else if (choice == 5) { // 주문 취소
                if (cart.isEmpty()) {
                    System.out.println("장바구니에 항목이 없습니다.");
                } else {
                    System.out.println("진행 중인 주문이 취소되었습니다.");
                    cart.clear(); // 장바구니 비우기
                }
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
