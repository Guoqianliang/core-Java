package com.gql.exercise4_26;

/**
 * @Description:
 * @author Guoqianliang
 */
public class Demo01 {
    public static void main(String[] args) {
        int m = 12, n = 34;
        // m==12 n==35
        System.out.printf("%d%d", m++, ++n);
        // n==35 m==14
        System.out.printf("%d%d\n", n++, ++m);
    }
}
