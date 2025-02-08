package com.example.coupon;

public class CouponA {
    public float calculate(int[] cartItems) {
        float total = 0;
        for (int cartItem: cartItems) {
            total += cartItem;
        }
        return total;
    }
}
