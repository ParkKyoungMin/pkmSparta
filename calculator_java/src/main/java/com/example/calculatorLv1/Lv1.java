package com.example.calculatorLv1;

import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성, 사용자 입력을 받기 위함

        String power = "Start"; // 계산기를 시작하기 위한 초기 상태 설정
        if (!power.equals("exit")) { // 사용자가 "exit"를 입력하지 않았을 경우
            while (!power.equals("exit")) { // "exit" 입력 시까지 반복
                try {
                    // 첫 번째 숫자 입력
                    System.out.println("첫 번째 숫자를 입력하시오 : ");
                    int firstNumber = sc.nextInt(); // 사용자로부터 첫 번째 숫자 입력 받음

                    // 두 번째 숫자 입력
                    System.out.println("두 번째 숫자를 입력하시오 : ");
                    int secondNumber = sc.nextInt(); // 사용자로부터 두 번째 숫자 입력 받음

                    sc.nextLine(); // 입력 버퍼를 비우기 위해 nextLine 호출

                    // 사칙연산 기호 입력
                    System.out.println("사칙연산 기호를 입력하시오. ");
                    String operator = sc.nextLine(); // 사용자로부터 연산자 입력 받음
                    char operatorBasic = operator.charAt(0); // 연산자의 첫 번째 문자 추출

                    int result = 0; // 계산 결과를 저장할 변수 초기화

                    // 입력된 연산자에 따라 계산 수행
                    switch (operatorBasic) {
                        case '+':
                            result = firstNumber + secondNumber; // 덧셈
                            break;

                        case '-':
                            result = firstNumber - secondNumber; // 뺄셈
                            break;

                        case '*':
                            result = firstNumber * secondNumber; // 곱셈
                            break;

                        case '/':
                            // 나눗셈: 0으로 나누는 경우 예외 처리
                            if (secondNumber != 0) {
                                result = firstNumber / secondNumber; // 나눗셈
                                break;
                            } else {
                                System.out.println("0으로 나눌 수 없습니다."); // 0으로 나누는 경우 경고 메시지
                                continue; // 다음 루프로 넘어감
                            }
                        default:
                            System.out.println("잘못된 입력입니다."); // 잘못된 연산자 입력 시 경고 메시지
                            continue; // 다음 루프로 넘어감
                    }

                    // 계산 결과 출력
                    System.out.println("계산 결과 : " + result);
                    System.out.println("계산기를 계속 이용하시겠습니까? (종료하실 경우 exit 입력)");
                    power = sc.nextLine(); // 사용자에게 계속 사용할지 여부 물어보기

                } catch (Exception e) {
                    // 예외 발생 시 처리
                    System.out.println("정수 값만 입력해야합니다."); // 정수가 아닌 값을 입력한 경우 경고 메시지
                    sc.nextLine(); // 잘못된 입력을 처리하기 위해 입력 버퍼 비우기
                }
            }
        }
    }
}
