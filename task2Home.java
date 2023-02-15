// 2. Вывести все простые числа от 1 до 1000

public class task2Home {
    public static void main(String[] args) {
        int limit = 1000;
        for (int i = 2; i <= limit; i++) { // i- делимое
            int count = 0;
            for (int j = 2; j <= i; j++) { // j - делитель
                if (i % j == 0)
                    count++;
            }
            if (count == 1) {
                System.out.printf("%d ", i);
            }

        }
    }
}
