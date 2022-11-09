package HomeWorke2_10;

import java.util.HashMap;

public class TaskThree {

    private static HashMap<String, Integer> output = new HashMap<>();




    public static void addTooutput(String str, Integer count) {
        if (output.containsKey(str) && output.get(str).equals(count)) {
            throw new RuntimeException("Ошибка.");
        }
        output.put(str, count);
    }


    public HashMap<String, Integer> getCollect() {
        return output;
    }
    public static void main(String[] args){
        output.put("ABC",555);
        output.put("CDF",777);
        output.put("GKL",999);
        System.out.println(output);
    }
}
//Создайте коллекцию Map<String, Integer>. Заполните ее произвольными значениями.
//
//Напишите метод, который принимает строку (ключ) и целое число (значение) и пытается добавить ее в коллекцию по логике:
//
//Если такого ключа нет, то просто добавляет данные в коллекцию.
//Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
//Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.
//Пример: есть HashMap "str1" —> 2.
//
//Если метод принимает "str2" —> 1, добавляем новое значение.
//
//Если метод принимает "str1" —> 2, кидаем исключение.
//
//Если метод принимает "str1" —> 5, обновляем коллекцию (теперь по ключу "str1" будет храниться значение 5).