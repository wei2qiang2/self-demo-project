package com.atguigu.demo.classinit;

/**
 * @author weiqiang
 * @date 2020/1/14 10:31
 * @decription
 * @updateInformaion
 */
public class Son extends Father {

    private int i = test();
    private static  int j = method();

    static {
        System.err.println("(6)");
    }

    Son() {
        System.err.println("(7)");
    }

    {
        System.err.println("(8)");
    }

    public int test() {
        System.err.println("(9)");
        return 1;
    }


    public static int method() {
        System.err.println("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.err.println();
        Son s2 = new Son();
    }
}
