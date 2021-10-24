package com.lijiachenggong.java;

import java.util.Scanner;

/**
 * @author lijiachenggong
 * @version 1.0
 */
public class 华氏温度转摄氏温度 {
    public static void main(String[] args) {
        int f;
        Scanner in = new Scanner(System.in);
        f = in.nextInt();
        int c;
        c = (f - 32) * 5 / 9;
        System.out.println((int)(c));
    }
}
