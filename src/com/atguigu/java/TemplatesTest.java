package com.atguigu.java;

/**
 * Created by IntelliJ IDEA.
 * User: Zimu Zhang
 * Date: 2022/10/8 20:02
 * FileName: TemplatesTest
 */
public class TemplatesTest {


    public static void main(String[] args) {
        System.out.println("hello");
        String[] arr = new String[]{"1","2","3"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
