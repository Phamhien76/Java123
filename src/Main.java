import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập một số nguyên");
        int number = scanner.nextInt();
        if (number % 5 == 0) {
            System.out.printf("%d chia hết cho 5\n",number);
        }

    }
}
