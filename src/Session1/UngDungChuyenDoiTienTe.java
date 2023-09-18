package Session1;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        //B1: Tạo dự án mới và khai báo hàm main()
        //B2: Khai báo biến tỉ giá (rate) để lưu giá trị tỉ giá giữa VND và USD. Hiện nay, tỉ giá có thể là 23000 VND/USD.
        double Rate = 23000.0;
        double UsdAmount;
        //B3: Khai báo biến giá trị USD và cho người dùng nhập vào.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập USD cần đổi: ");
        UsdAmount = scanner.nextDouble();
        //B4: Tính giá trị VND và hiển thị ra màn hình.
        double VndAmount = UsdAmount * Rate;
        System.out.printf("Đồng VND là:" + VndAmount+"VND");
        scanner.close();
    }
}
