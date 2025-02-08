package com.example.coupon;

public class CouponB {
    public float calculate(int[] cartItems) {
        float total = 0;
        int shipPrice = 800;
        for (int cartItem: cartItems) {
            total += cartItem;
        }
        total = (int) (0.9 * total);
        if (total < 5000) {
            total += shipPrice;
        }
        return total;
    }
}
