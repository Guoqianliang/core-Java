package com.gql;

/**
 * @Description:
 * @author Guoqianliang
 * @date 20:58 - 2021/4/24
 */
public class Demo01 {

    public static void main(String[] args) {
        int a = 10, b = 20;
        Demo01.swap(a, b);
        System.out.printf("a的值是%d,b的值是%d\n", a, b);

        String s1 = "hello", s2 = "world";
        Demo01.swap(s1, s2);
        System.out.printf("s1的值是%s,s2的值是%s\n", s1, s2);

        String ss = "aaa";
        f(ss);
        System.out.println("执行后" + ss);

    }

    private static void f(String ss) {
        ss = "bbb";
    }


    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    private static void swap(String x, String y) {
        String temp = x;
        x = y;
        y = temp;
    }

}
