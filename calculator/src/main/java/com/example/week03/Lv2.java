package com.example.week03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lv2 {
    private List<String> memory;

    public Lv2() {
        this.memory = new ArrayList<>();
    }

    public String calculate(int a, int b, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                // break를 입력하지 않아서 문제가 되었음.
                if (b != 0) {
                    result = a / b;
                    break;
                } else {
                    System.out.println("두번째 정수의 입력 값이 잘못되었습니다.");
                    return " ";
                }
                // default를 설정해줘야하는 것을 잊음.
            default:
                System.out.println("연산자 입력이 잘못되었습니다.");
                System.out.println(" 입력된 연산자 : " + operator);
                return " ";
        }
        memory.add(a + " " + operator + " " + b + " = " + result);
        return String.valueOf(result);
    }

    public List<String> getMemory() {
        return this.memory;
    }

    public void removeFirstMemory() {
        if (!memory.isEmpty()) {
            memory.remove(0);
            System.out.println("저장된 첫번째 데이터가 삭제되었습니다.");
        } else {
            System.out.println("저장된 데이터가 없습니다.");
        }
    }

    public void setMemory(int index, String value) {
        if (index >= 0 && index < memory.size()) {
            memory.set(index, value);
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }

    ///


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lv2 ca = new Lv2();
        String power = "Start";

        while (!power.equals("exit")) {
            try {
                System.out.println("첫번째 정수를 입력 : ");
                int firstNumber = sc.nextInt();
                System.out.println("두번째 정수를 입력 : ");
                int secondNumber = sc.nextInt();

                sc.nextLine(); // 버퍼 비우기
                System.out.println("연산자를 입력 : ");
                char operator = sc.nextLine().charAt(0);

                String result = ca.calculate(firstNumber, secondNumber, operator);
                System.out.println("계산된 결과 : " + result);
                System.out.println("현재 저장된 메모리 : " + ca.getMemory());


                // 메모리에서 가장 먼저 저장된 데이터 삭제
                ca.setMemory(0, "10 + 10 = 19");
                System.out.println("수정된 메모리 : " + ca.getMemory());
                ca.removeFirstMemory();
                System.out.println("삭제후 저장된 메모리 : " + ca.getMemory());
                System.out.println("계속하시려면 아무키나 입력해주세요.(exit 입력시 종료)");
                power = sc.nextLine();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}