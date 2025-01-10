package com.example.calculatorLv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> memory; // 계산 결과를 저장할 메모리 리스트

    // 생성자: Calculator 인스턴스를 생성할 때 메모리 리스트를 초기화
    public Calculator() {
        this.memory = new ArrayList<>();
    }

    // 두 정수와 연산자로 계산을 수행하고 결과를 문자열로 반환
    public String calculate(int a, int b, char operator) {
        int result = 0; // 계산 결과를 저장할 변수 초기화

        // 입력된 연산자에 따라 계산 수행
        switch (operator) {
            case '+':
                result = a + b; // 덧셈
                break;
            case '-':
                result = a - b; // 뺄셈
                break;
            case '*':
                result = a * b; // 곱셈
                break;
            case '/':
                // 나눗셈: 0으로 나누는 경우 예외 처리
                if (b != 0) {
                    result = a / b; // 나눗셈
                } else {
                    return "0으로 나눌 수 없습니다."; // 0으로 나누는 경우 오류 메시지 반환
                }
                break;
            default:
                return "잘못된 연산자입니다."; // 잘못된 연산자 입력 시 오류 메시지 반환
        }

        // 계산 결과를 메모리에 저장
        memory.add(a + " " + operator + " " + b + " = " + result);
        return String.valueOf(result); // 계산 결과를 문자열로 반환
    }

    // 메모리 리스트를 반환하는 메서드
    public List<String> getMemory() {
        return this.memory; // 현재 메모리 리스트 반환
    }

    // 메모리에서 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeFirstMemory() {
        if (!memory.isEmpty()) { // 메모리가 비어있지 않은 경우
            memory.remove(0); // 첫 번째 데이터를 삭제
            System.out.println("저장된 첫번째 데이터가 삭제되었습니다.");
        } else {
            System.out.println("저장된 데이터가 없습니다."); // 메모리가 비어 있을 경우 경고 메시지
        }
    }

    // 특정 위치의 메모리 값을 수정하는 메서드
    // setMemory = Index 번호를 입력하고 바꾸고 싶은 계산 식과 답을 입력
    public void setMemory(int index, String value) {
        if (index >= 0 && index < memory.size()) { // 유효한 인덱스인지 확인
            memory.set(index, value); // 주어진 인덱스의 값을 수정
        } else {
            System.out.println("유효하지 않은 인덱스 번호입니다."); // 잘못된 인덱스 입력 시 경고 메시지
        }
    }
}
