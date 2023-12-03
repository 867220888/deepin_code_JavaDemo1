package cn.lwm2023.lcode;

public class demo1 {
    public static void main(String[] args) {
        int [] ages = new int[] {18, 19, 20};
        String [] names = new String[] {"张三", "李四", "王五"};
        double [] scores = new double[] {99.5, 98.5, 97.5};
        for (int i = 0; i < ages.length; i++) {
            System.out.println("姓名：" + names[i] + "，年龄：" + ages[i] + "，成绩：" + scores[i]);
        }
    }
}
