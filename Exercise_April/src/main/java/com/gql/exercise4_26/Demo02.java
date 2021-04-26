package com.gql.exercise4_26;

/**
 * @Description:
 * @author Guoqianliang
 */
public class Demo02 {
    public static void main(String[] args) {
        int a = 100, b = 50, c = a-- - b, d = a-- - b;
        // 98
        System.out.println(a);
        // 50
        System.out.println(b);
        // 50
        System.out.println(c);
        // 49
        System.out.println(d);
    }
}
