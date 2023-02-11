// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.

public class task4HOME {
    public static void main(String[] args) {
        String my_str = "2? + ?5 = 69";
        String [] arr = my_str.split(" ");
        String q = arr[0];
        String w = arr[2];
        String z = arr[arr.length - 1];
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
           int num_q = Integer.parseInt(q.replace("?", Integer.toString(i)));
            for (int j =0; j < 10; j++) {
                int num_w = Integer.parseInt(w.replace("?", Integer.toString(j)));
                for (int k = 0; k < 10; k++) {
                    int num_z = Integer.parseInt(z.replace("?", Integer.toString(k)));
                    if (num_q + num_w == num_z) {
                        System.out.printf("Решение уравнения %s является %d + %d = %d\n",my_str, num_q, num_w, num_z);
                        flag = false;
                        break;
                    }
                }
                if (flag == false) break;
            }
            if (flag == false) break;
        } 
        if (flag) System.out.println("Решений нет!");
    }
}
