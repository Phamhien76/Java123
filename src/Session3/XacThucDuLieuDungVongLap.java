package Session3;

import java.util.Scanner;

public class XacThucDuLieuDungVongLap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.print("Nhập cạnh a: ");
            double a=Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập cạnh b: ");
            double b=Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập cạnh c: ");
            double c=Double.parseDouble(scanner.nextLine());

            double p= (a+b+c)/2;
            double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("Chu vi của tam giác là:  "+p*2);
            System.out.println("Diện tích của hình tam giác là: "+area);
            break;
            }else {
                System.out.println("Đây không phải là tam giác(3 cạnh phải >0"+
                        "Tổng của hai cạnh ngắn nhất phải lớn hơn cạnh dài nhất"+
                "Tổng của hai cạnh bất kỳpharair hơn độ dài cạnh còn lại");
            }
        }

    }
}
