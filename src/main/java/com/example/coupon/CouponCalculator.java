package com.example.coupon;

public class CouponCalculator {
    public String findBestCoupon(int[] cartItems) {
        float[] tmpTotal = {
            new CouponA().calculate(cartItems),
            new CouponB().calculate(cartItems),
            new CouponC().calculate(cartItems)
        };  // A, B, C
        String[] flags = {"A", "B", "C"};

        float minPrice = tmpTotal[0];
        String minFlag = "A";
        for (int i = 1; i < tmpTotal.length; i++) {
            if (tmpTotal[i] < minPrice) {
                minPrice = tmpTotal[i];
                minFlag = flags[i];
            }
        }
        return minFlag;
    }
}
