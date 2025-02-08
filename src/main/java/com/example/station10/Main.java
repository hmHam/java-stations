package com.example.station10;

public class Main {
    public static void main(String[] args) {
        // テストする場合、以下の「//」を消してください。
        System.out.println("商品合計: 1000, 支払額: " + new Main().applyTaxAndShippingFee(1000));
        System.out.println("商品合計: 10000, 支払額: " + new Main().applyTaxAndShippingFee(10000));
        System.out.println("商品合計: 9999, 支払額: " + new Main().applyTaxAndShippingFee(9999));
    }

    // ここから
    public float applyTaxAndShippingFee(int noTaxSubtotal) {
        float total = noTaxSubtotal;
        int shipPrice = 800;
        if (noTaxSubtotal < 10000) {
            total += shipPrice;
        }
        total = (float) (total * 1.1);
        return total;
    }
    // ここまで
}
