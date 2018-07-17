package com.jlu.yzy;

public class HelloWord {
    /**
     * 分别定义7种数据类型的一个变量，给他们赋初值
     *
     * byte: -50
     * short: 500
     * int: 1000
     * long: 20000
     * float: 0.2f
     * double: 0.1
     * char: 'a'
     * 按照以下格式依次打印各个变量，以整形和char型为例，打印格式为：
     *
     * 1000(int)所占的bit位数为32
     * a(char)所占的bit位数为16
     * @param args
     */
    public static void main(String args[]) {
        byte a = -50;
        short b = 500;
        int c= 1000;
        long d = 20000;
        float e = 0.2f;
        double f = 0.2f;
        char g = 'a';
        System.out.println(a+"(byte)所占的bit位数为8");
        System.out.println(b+"(short)所占的bit位数为16");
        System.out.println(c+"(int)所占的bit位数为32");
        System.out.println(d+"(long)所占的bit位数为64");
        System.out.println(e+"(float)所占的bit位数为32");
        System.out.println(f+"(double)所占的bit位数为64");
        System.out.println(g+"(char)所占的bit位数为16");
    }
}
