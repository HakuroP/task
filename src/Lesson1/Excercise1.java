package Lesson1;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int h = s / 3600;
        int m = s % 3600 / 60;
        int sec = s % 3600 % 60;
        System.out.println(h + "h " + m + "m " + sec + "sec");
        //git
    }
}
