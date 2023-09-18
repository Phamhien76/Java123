package baiTap;

import java.util.Scanner;

public class Vonglap {
    public static void main(String[] args) {
        // Nhập vào 1 số nguyên từ bàn phím (number). in ra các số chẵn trong khoảng 1-number
        //B1 Nhập vào 1 số nguyên từ bàn phím
        //1.: Khởi tạo đối tượng Scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        //B2: Dùng vòng lắp for duyệt các số từ 1-number
        System.out.printf("Số chẵn trong khoảng từ 1-%d là:\n",number);
        for (int i=2; i<=number;i++){
            if(i%2==0){
                System.out.printf("%d\t",i);
            }

        }
        //B3: Kiểm tra i có phải số chẵn hay không (if)=> chẵn thì in ra

    }
}
