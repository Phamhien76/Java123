package Session3;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Hiển thị các số nguyen tố nhỏ hơn 100");
        boolean isPrime;
        for (int number = 2; number < 100; number++) {
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
