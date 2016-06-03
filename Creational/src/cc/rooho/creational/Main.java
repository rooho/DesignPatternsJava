package cc.rooho.creational;

import cc.rooho.creational.singleton.SingletonEnum;

public class Main {
    public static void main(String[] args) {
        System.out.printf(" " + SingletonEnum.uniqueInstance.getMsg());
    }
}
