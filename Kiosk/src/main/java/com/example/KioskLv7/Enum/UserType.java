package com.example.KioskLv7.Enum;

public enum UserType {
    VETERAN(0.10), // 국가유공자 10%
    SOLDIER(0.05), // 군인 5%
    STUDENT(0.03), // 학생 3%
    GENERAL(0.00); // 일반인 0%

    private final double discountRate;

    UserType(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
