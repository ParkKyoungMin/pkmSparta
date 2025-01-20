package com.example.KioskLv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        int choice; // 사용자의 메뉴 선택을 저장할 변수

        do {
            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료          | 종료");
            System.out.print("메뉴를 선택하세요: "); // 사용자에게 입력을 요구

            // 사용자 입력 처리
            choice = scanner.nextInt(); // 사용자 입력을 정수로 받음

            // 선택된 메뉴에 따른 메시지 출력 로직
            switch (choice) {
                case 1:
                    System.out.println("ShackBurger를 선택하셨습니다.");
                    break;
                case 2:
                    System.out.println("SmokeShack을 선택하셨습니다.");
                    break;
                case 3:
                    System.out.println("Cheeseburger를 선택하셨습니다.");
                    break;
                case 4:
                    System.out.println("Hamburger를 선택하셨습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    break;
            }
            System.out.println();
        } while (choice != 0); // 0이 입력될 때까지 반복

        scanner.close(); // Scanner 자원 해제
    }
}
