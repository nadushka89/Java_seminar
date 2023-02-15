
// 3. Реализовать простой калькулятор
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class task3HOME {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task3HOME.class.getName());
        FileHandler fh = new FileHandler("log1.txt");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Простой калькулятор");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        float a = iScanner.nextFloat();
        System.out.printf("Введите операцию(+, -, *, /): ");
        String operation = iScanner.next();
        System.out.printf("Введите второе число: ");
        float b = iScanner.nextFloat();
        float result=0;
        switch (operation) {
            case "+":
                result = a + b;
                System.out.printf("Результат операции сложения чисел %.2f + %.2f = %.2f ",a,b,result);
                break;
            case "-":
                result = a - b;
                System.out.printf("Результат операции вычитания чисел %.2f - %.2f = %.2f ",a,b,result);
                break;
            case "*":
                result = a * b;
                System.out.printf("Результат операции умножения чисел %.2f * %.2f = %.2f ",a,b,result);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Error! Делить на ноль нельзя!");
                    break;
                } else {
                    result = a / b;
                    System.out.printf("Результат операции деления чисел %.2f / %.2f = %.2f  ",a,b,result);
                    break;
                }
            default:
                System.out.println("Нужно вводить +, -, * или /");
                break;
        }
        iScanner.close();
    }
}
