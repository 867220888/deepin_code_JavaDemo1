package cn.lwm2023.lcode;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字表示范围：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum++;
            }
        }
        System.out.println("范围内能被3和5整除的数字有：" + sum + "个");
    }
}
