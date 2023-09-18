package baiTap;

import java.util.Scanner;

public class UngDung {
    public static void main(String[] args) {
        //Nhập các số từ bàn phím, kết thúc nhập khinhaapj 0
        //1. Sử dụng vòng lặp while(vô hạn) nhập dữ liệu
        //2. Nhập dũ liệu number
        //3. Kiểm tra numbe=0-->thoát khỏi vòng lặp
        int ctn0dd=0;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào số nguyên: ");
            int number=Integer.parseInt(scanner.nextLine());
            if(number==0){
                System.out.println("Chương trình kết thúc");
                ctn0dd++;
            }
        }
    }
}
