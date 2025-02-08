package com.example.coupon;

public class CouponC {
    public float calculate(int[] cartItems) {
        float total = 0;
        int shipPrice = 800;
        for (int cartItem: cartItems) {
            if (cartItem >= 2000) {
                total += (int) (0.8 * cartItem);
            } else {
                total += cartItem;
            }
        }
        if (total < 5000) {
            total += shipPrice;
        }
        return total;
    }
}
