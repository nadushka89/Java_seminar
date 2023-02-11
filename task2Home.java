// 2. Вывести все простые числа от 1 до 1000

public class task2Home {
    public static void main(String[] args) {
        int limit = 1000;
        for (int number = 2; number <= limit; number++) { // number- делимое
            for (int del = 2; del <= number; del++) { // del - делитель
                int remaining = number % del; // remaining - остаток
                if (remaining == 0) {
                    break;
                }
                if (del == number - 1) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}
