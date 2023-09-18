package baiTap;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class VongWhile {
    public static void main(String[] args) {
        //Nhập và in ra 10 số lẻ
        //B1: Khai báo và khởi tạo biến để đếm số lẻ để in cnt0dd=0
        int cnt0dd = 0;
        Scanner scanner = new Scanner(System.in);
        while (cnt0dd < 10) {
            System.out.println("Nhập vào số nguyên: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 1) {
                System.out.println(number);
                cnt0dd++;

            }
        }
    }
}