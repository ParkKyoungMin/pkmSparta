package com.example.calculatorLv2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Calculator 인스턴스 생성
        Scanner sc = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체 생성
        String power = "Start"; // 초기 상태 설정

        while (!power.equals("exit")) { // "exit" 입력 시까지 반복
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt(); // 첫 번째 숫자 입력

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt(); // 두 번째 숫자 입력
                sc.nextLine(); // 입력 버퍼를 비우기 위해 호출

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.nextLine().charAt(0); // 연산자 입력

                // 계산 수행
                String result = calculator.calculate(num1, num2, operator);
                System.out.println("계산된 결과: " + result);
                System.out.println("현재 저장된 메모리: " + calculator.getMemory());

                // 메모리에서 데이터 수정
                calculator.setMemory(0, "1 + 9 = 10");
                System.out.println("현재 저장된 메모리: " + calculator.getMemory());

                // 메모리에서 가장 먼저 저장된 데이터 삭제
                calculator.removeFirstMemory();
                System.out.println("현재 저장된 메모리: " + calculator.getMemory());

                // 계속 사용 여부 물어보기
                System.out.println("계속하시려면 아무키나 입력해주세요.(exit 입력시 종료)");
                power = sc.nextLine(); // 계속 사용할지 여부 물어보기

                // "exit" 입력 시 루프 종료 [없어도 기능하지만 직관성을 위해 추가]
                if (power.equals("exit")) {
                    break; // 루프 종료
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력해주세요."); // 숫자 입력 오류
                sc.nextLine(); // 잘못된 입력을 처리하기 위해 입력 버퍼 비우기
            } catch (IllegalArgumentException  e) {
                System.out.println(e.getMessage()); // 연산자 입력 오류
            }
        }
        sc.close(); // Scanner 리소스 해제
    }
}
