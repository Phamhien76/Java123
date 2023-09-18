package baiTap;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*Nhập vào một số nguyên từ bàn phím
        Hiển thị menu và thực hiện các chức năng theo menu:
        ***************MENU******************
        1. Kiểm tra chẵn/lẻ
        2. Kiểm tra số nguyên tố
        3. Tính tổng ước các số nguyên
        4. Kiểm tra số hoàn hảo
        5. Thoát
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên");
        int number = scanner.nextInt();

        while (true) {
            System.out.println("*********MENU************");
            System.out.println("1. Kiểm tra chẵn/lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Tính tổng ước các số nguyên");
            System.out.println("4. Kiểm tra số hoàn hảo");
            System.out.println("5. Thoát");
            System.out.println("************************");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //chẵn lẻ
                    if (number % 2 == 0) {
                        System.out.printf(number + "là số chẵn.");
                    } else {
                        System.out.printf(number + "là số lẻ.");
                    }
                    break;
                case 2:
                    //Kiểm tra số nguyên tố
                    boolean IsPrime = true;
                    if (number <= 1) {
                        System.out.println("Số nhập vào không chính xác");
                        }else {
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                            if (number % i == 0) {
                                IsPrime = false;
                                break;
                            }

                        }
                    }
                    if (IsPrime) {
                        System.out.println("Số nhập vào là số nguyên tố.");
                    } else {
                        System.out.println("Số nhập vào không phải là số nguyên tố.");
                    }
                    break;
                case 3:
                    //Tính tổng ước các số nguyên
                    int sum = 0;
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0) {
                            sum += i;
                        }
                    }
                    System.out.printf("Tổng ước các số nguyên của %d là:\n", sum);
                    break;
                case 4:
                    //Kiểm tra số hoàn hảo
                    int divisorSum = 0;
                    for (int i = 0; i < number; i++) {
                        if (number % i == 0) {
                            divisorSum += i;
                        }
                    }
                    if (divisorSum == number) {
                        System.out.println("số nhập vào là số hoàn hảo.");
                    } else {
                        System.out.println("Số nhập vào không không phải là số hoàn hảo.");
                    }
                    break;
                case 5:
                    // Thoát khỏi chương trình
                    System.out.println("Thoat khỏi chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại");

            }
        }
    }
}
