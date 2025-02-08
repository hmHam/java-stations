package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから
        int shipPrice = 800;
        int[] tmpTotal = {0, 0, 0};  // A, B, C
        String[] flags = {"A", "B", "C"};
        
        for (int i = 0; i < itemPrices.length; i++) {
            tmpTotal[0] += itemPrices[i];  // クーポンA（適用=for文の最後で送料を足さないこと）

            tmpTotal[1] += itemPrices[i];  // クーポンB（適用=for文の最後で合計から10%引くこと）

            if (itemPrices[i] >= 2000) {
                tmpTotal[2] += (int) (0.8 * itemPrices[i]);  // クーポンC適用
            } else {
                tmpTotal[2] += itemPrices[i];
            }

            if (i == (itemPrices.length - 1)) {
                // クーポン適用後の金額に基づき判定する
                tmpTotal[1] = (int) (0.9 * tmpTotal[1]);  // クーポンB適用
                if (tmpTotal[1] < 5000) {
                    tmpTotal[1] += shipPrice;
                }
                if (tmpTotal[2] < 5000) {
                    tmpTotal[2] += shipPrice;
                }
            }
        }
        int minPrice = tmpTotal[0];
        String minFlag = "A";
        for (int i = 1; i < tmpTotal.length; i++) {
            if (tmpTotal[i] < minPrice) {
                minPrice = tmpTotal[i];
                minFlag = flags[i];
            }
        }
        System.out.println(minFlag);
        // ここまで
    }
}
