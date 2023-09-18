package Session3;

import java.util.Scanner;

public class KiemTraSoNguenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập một số nguyên dương lớn hơn 1");
        int number=scanner.nextInt();
        //Kiểm tra số nhập vào có lớn hơn 1 hay không?
        if(number<=1){
            System.out.println("Number phải lớn hơn 1");
        }else {
            boolean IsPrime=true;
            int i=2;
            while (i<=Math.sqrt(number)){
                if(number%i==0){
                    IsPrime=false;
                    break;
                }
                i++;
            }
            if(IsPrime){
                System.out.println(number+"Là số nguyên tố");
            }else {
                System.out.println("Không phải là số nguyên tố");
            }
        }

    }
}
