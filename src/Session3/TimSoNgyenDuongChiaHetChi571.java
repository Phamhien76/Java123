package Session3;

import java.util.Scanner;

public class TimSoNgyenDuongChiaHetChi571 {
    public static void main(String[] args) {
        int n = 1;
        boolean mach = false;
        while (!mach) {
            if (n % 5 == 0 && n % 7 == 0 && n % 11 == 0) {
                mach = true;
                System.out.println("Số nguyên nhỏ nhất chia hết cho 5,6,11 là: " + n);
            }
            n++;
        }
    }
}


