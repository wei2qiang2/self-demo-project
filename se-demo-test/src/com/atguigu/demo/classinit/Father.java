package com.atguigu.demo.classinit;

/**
 * @author weiqiang
 * @date 2020/1/14 10:28
 * @decription
 * @updateInformaion
 */
public class Father {

    private int i = test();

    private int j = method();

    static {
        System.err.println("(1)");
    }
    Father() {
        System.err.println("(2)");
    }

    {
        System.err.println("(3)");
    }
    public int test() {
        System.err.println("(4)");
        return 1;
    }

    public static int method() {
        System.err.println("(5)");
        return 1;
    }
}
