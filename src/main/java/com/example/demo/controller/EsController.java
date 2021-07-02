package com.example.demo.controller;

/**
 * @Description:
 * @author:lenovo
 * @Date:2021/6/30
 */
public class EsController {
    private int sum = 0;
    private int ad=1;

    public static void main(String[] args) {
        System.out.println("测试");
        addSum(10);
        add(10,10);
        add1(20,20);
    }

    private static void addSum(int i){
        System.out.println("addSum:"+i);
    }

    private static void add(int a,int b){
        System.out.println("add:"+(a+b));
    }

    private static void add1(int a,int b){
        System.out.println("add:"+(a+b)+"-");
    }


}
