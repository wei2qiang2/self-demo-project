package com.atguigu.demo;

/**
 * @author weiqiang
 * @date 2020/1/14 9:22
 * @decription
 * @updateInformaion
 */
public class AutoIncrement {

    public static void main(String[] args) {
        int i = 1;  // i存在局部变量表
        i = i++;    // 将1压倒操作数栈， i++ , i由1变为了2，再将右边的结果赋值给i变量，但是此时的i=1，所有 i = 1，覆盖了原有的2
        int j = i++; // j=1； i=2， i++后没有覆盖原来的i，存在了j的位置
        int k = i + ++i * i++; // i压入栈， 3*3+2
        System.err.println("i=" + i);
        System.err.println("j=" + j);
        System.err.println("k=" + k);

        /**
         *          0: iconst_1                 0x03:将int型（1）推送至栈帧
         *          1: istore_1                 把栈顶的值存到第0个本地变量中
         *          2: iload_1               将第二个int型本地变量推送至栈顶
         *          3: iinc          1, 1       0x84:将指定int型变量增加指定值（i++, i--, i+=2）
         *          6: istore_1                 把栈顶的值存到第0个本地变量中
         *          7: iload_1                  将第二个int型本地变量推送至栈顶
         *          8: iinc          1, 1       0x84:将指定int型变量增加指定值（i++, i--, i+=2）
         *         11: istore_2                 把栈顶的值存到第1个本地变量中
         *         12: iload_1                  将第二个int型本地变量推送至栈顶
         *         13: iinc          1, 1       0x84:将指定int型变量增加指定值（i++, i--, i+=2）
         *         16: iload_1
         *         17: iload_1
         *         18: iinc          1, 1
         *         21: imul
         *         22: iadd
         *         23: istore_3
         *         24: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
         *         27: new           #3                  // class java/lang/StringBuilder
         *         30: dup
         *         31: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
         *         34: ldc           #5                  // String i=
         *         36: invokevirtual #6                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *         39: iload_1
         *         40: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         *         43: invokevirtual #8                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         *         46: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         *         49: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
         *         52: new           #3                  // class java/lang/StringBuilder
         *         55: dup
         *         56: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
         *         59: ldc           #10                 // String j=
         *         61: invokevirtual #6                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *         64: iload_2
         *         65: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         *         68: invokevirtual #8                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         *         71: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         *         74: getstatic     #2                  // Field java/lang/System.err:Ljava/io/PrintStream;
         *         77: new           #3                  // class java/lang/StringBuilder
         *         80: dup
         *         81: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
         *         84: ldc           #11                 // String k=
         *         86: invokevirtual #6                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         *         89: iload_3
         *         90: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         *         93: invokevirtual #8                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         *         96: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         */
    }
}
