package com.example.calculatorLv1;

import java.util.Scanner;

public class Lv1 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String power = "Start";
    if (!power.equals("exit")) {
        while (!power.equals("exit")) {
            try {
                System.out.println("첫 번째 숫자를 입력하시오 : ");
                int firstNumber = sc.nextInt();

                System.out.println("두 번째 숫자를 입력하시오 : ");
                int secondNumber = sc.nextInt();

                sc.nextLine();

                System.out.println("사칙연산 기호를 입력하시오. ");

                String operator = sc.nextLine();
                char operatorBasic = operator.charAt(0);

                int result = 0;

                switch (operatorBasic) {
                    case '+':
                        result = firstNumber + secondNumber;
                        break;

                    case '-':
                        result = firstNumber - secondNumber;
                        break;

                    case '*':
                        result = firstNumber * secondNumber;
                        break;

                    case '/':
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                            break;
                        } else {
                            System.out.println("0으로 나눌 수 없습니다.");
                            continue;
                        }
                    default:
                        System.out.println("잘못된 입력입니다.");
                        continue;
                }

                System.out.println("계산 결과 : " + result);
                System.out.println("계산기를 계속 이용하시겠습니까? (종료하실 경우 exit 입력)");
                power = sc.nextLine();

            } catch (Exception e) {
                System.out.println("정수 값만 입력해야합니다.");
                sc.nextLine();
            }
        }

    }
}
}
