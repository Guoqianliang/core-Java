package com.gql.exercise4_26;

/**
 * @Description: 测试
 * @author Guoqianliang
 */
public class Demo04 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int k = 0;
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) && (++y > 2) && (k++ > 2)) {
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x + "" + y + "" + k);
    }
}
