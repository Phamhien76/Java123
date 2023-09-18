package Session3;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("Hiển thị 20 số nguyen tố đầu tiên");
        int count = 0;
        int n = 2;
        while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
