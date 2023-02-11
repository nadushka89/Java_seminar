// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1HOME {
    public static void main(String[] args) {
        int t = 0;
        int mult = 1;
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = iScanner.nextInt();
        t=(n*(n+1))/2;
        if (n==0 | n==1){
            mult = 1;
        }
        while (n != 0) {
            mult *= n;
            n = n - 1;
        }
        System.out.printf("Треугольное число = %d, произведение чисел n! = %d", t, mult);
        iScanner.close();
    }

}
