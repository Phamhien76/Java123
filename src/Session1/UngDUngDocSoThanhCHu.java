package Session1;

import java.util.Scanner;

public class UngDUngDocSoThanhCHu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hãy nhập số cần đọc: ");
            int number = Integer.parseInt(scanner.nextLine());
            int HangTram = number / 100;
            int HangChuc = number %100 / 10;
            int HangDonVi = number % 10;

            String DocChu = "";

            if (number >= 1000 || number < 0) {
                System.out.println("Số bạn nhập không phù hợp, Xin hayc nhập lại");
            } else {
                //Hang trăm
                switch (HangTram) {
                    case 1:
                        DocChu = "One Hundred";
                        break;
                    case 2:
                        DocChu = "Two Hundred";
                        break;
                    case 3:
                        DocChu = "Three Hundred";
                        break;
                    case 4:
                        DocChu = "Four Hundred";
                        break;
                    case 5:
                        DocChu = "Five Hundred";
                        break;
                    case 6:
                        DocChu = "Six Hundred";
                        break;
                    case 7:
                        DocChu = "Seven Hundred";
                        break;
                    case 8:
                        DocChu = "Eight Hundred";
                        break;
                    case 9:
                        DocChu = "Nine Hundred";
                        break;
                }
                if (HangChuc >= 2) {
                    switch (HangChuc) {
                        case 2:
                            DocChu = DocChu + "twenty";
                            break;
                        case 3:
                            DocChu = DocChu + "thirty";
                            break;
                        case 4:
                            DocChu = DocChu + "forty";
                            break;
                        case 5:
                            DocChu = DocChu + "fifty";
                            break;
                        case 6:
                            DocChu = DocChu + "sixty";
                            break;
                        case 7:
                            DocChu = DocChu + "seventy";
                            break;
                        case 8:
                            DocChu = DocChu + "eighty";
                            break;
                        case 9:
                            DocChu = DocChu + "ninety";
                            break;
                    }
                } else if(HangChuc==1) {
                    switch (HangDonVi) {
                        case 0:
                            DocChu = DocChu + "ten";
                            break;
                        case 1:
                            DocChu = DocChu + "eleven";
                            break;
                        case 2:
                            DocChu += "twelve";
                            break;
                        case 3:
                            DocChu += "thirteen";
                            break;
                        case 4:
                            DocChu += "fourteen";
                            break;
                        case 5:
                            DocChu += "fifteen";
                            break;
                        case 6:
                            DocChu += "sixteen";
                            break;
                        case 7:
                            DocChu += "seventeen";
                            break;
                        case 8:
                            DocChu += "eighteen";
                            break;
                        case 9:
                            DocChu += "nineteen";
                            break;

                    }
                }
                if(HangChuc!=1){
                    switch (HangChuc){
                        case 1:
                            DocChu =DocChu+"One";
                            break;
                        case 2:
                            DocChu =DocChu+"two";
                            break;
                        case 3:
                            DocChu =DocChu+ "three";
                            break;
                        case 4:
                            DocChu =DocChu+ "four";
                            break;
                        case 5:
                            DocChu =DocChu+ "fif";
                            break;
                        case 6:
                            DocChu =DocChu+ "six";
                            break;
                        case 7:
                            DocChu =DocChu+ "seven";
                            break;
                        case 8:
                            DocChu =DocChu+ "eigh";
                            break;
                        case 9:
                            DocChu =DocChu+ "nine";
                            break;
                    }
                }
                if(number==0){
                    DocChu="Zero";
                }
            }
            System.out.println(DocChu);
        }
    }
}




