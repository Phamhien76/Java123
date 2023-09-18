package baiTap;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.printf("Nhập một số ừ 0 đến 9: ");
        int number = scanner.nextInt();
        switch (number){
            case 0:
                System.out.printf("%d Phiên am 0 là:không\n.", number);
                break;
            case 1:
                System.out.printf("1 là:môt\n.", number);
                break;
            case 2:
                System.out.printf("2 là:hai\n.", number);
                break;
            case 3:
                System.out.printf("3 là:ba\n.", number);
                break;
            case 4:
                System.out.printf("4 là:4\n.", number);
                break;
            case 5:
                System.out.printf("5 là:năm\n.", number);
                break;
            case 6:
                System.out.printf("6 là:sáu\n.", number);
                break;
            case 7:
                System.out.printf("7 là:bảy\n.", number);
                break;
            case 8:
                System.out.printf("8 là:tám\n.", number);
                break;
            case 9:
                System.out.printf("9 là:chín\n.", number);
                break;
        }
    }
}
