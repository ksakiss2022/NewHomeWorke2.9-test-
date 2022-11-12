package HomeWorke2_10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TaskTwoTwo {
    //### Задание 2
    //
    //Создайте Map<Integer, String>, заполните ее 10 произвольными значениями.
    // Выведите в консоль всё содержимое коллекции в порядке добавления (в формате ”ключ:значение").
    private static final Map<Integer, List<String>> mapFromTwo = new HashMap<>();

    public static void main(String[] args) {

        var listOne = new java.util.ArrayList<>(List.of("Один"));
        var listTwo = new java.util.ArrayList<>(List.of("Два"));
        var listThree = new java.util.ArrayList<>(List.of("Три"));
        var listfour = new java.util.ArrayList<>(List.of("Четыре"));
        var listfive = new java.util.ArrayList<>(List.of("Пять"));
        var listSix = new java.util.ArrayList<>(List.of("Шесть"));
        var listSeven = new java.util.ArrayList<>(List.of("Семь"));
        var listEight = new java.util.ArrayList<>(List.of("Восемь"));
        var listNine = new java.util.ArrayList<>(List.of("Девять"));
        var listTen = new java.util.ArrayList<>(List.of("Десять"));
        var listEleven = new java.util.ArrayList<>(List.of("Одиннадцать"));
        var listTwelve = new java.util.ArrayList<>(List.of("Двенадцать"));
        var listThirteen = new java.util.ArrayList<>(List.of("Тринадцать"));
        var listFourteen = new java.util.ArrayList<>(List.of("Четырнадцать"));
        var listFifteen = new java.util.ArrayList<>(List.of("Пятнадцать"));
        var listSixteen = new java.util.ArrayList<>(List.of("Шестнадцать"));
        var listSeventeen = new java.util.ArrayList<>(List.of("Семнадцать"));
        var listEighteen = new java.util.ArrayList<>(List.of("Восемнадцать"));
        var listNineteen = new java.util.ArrayList<>(List.of("Девятнадцать"));
        var listTwenty = new java.util.ArrayList<>(List.of("Двадцать"));

        mapFromTwo.put(1, listOne);
        mapFromTwo.put(2, listTwo);
        mapFromTwo.put(3, listThree);
        mapFromTwo.put(4, listfour);
        mapFromTwo.put(5, listfive);
        mapFromTwo.put(6, listSix);
        mapFromTwo.put(7, listSeven);
        mapFromTwo.put(8, listEight);
        mapFromTwo.put(9, listNine);
        mapFromTwo.put(10, listTen);
        mapFromTwo.put(11, listEleven);
        mapFromTwo.put(12, listTwelve);
        mapFromTwo.put(13, listThirteen);
        mapFromTwo.put(14, listFourteen);
        mapFromTwo.put(15, listFifteen);
        mapFromTwo.put(16, listSixteen);
        mapFromTwo.put(17, listSeventeen);
        mapFromTwo.put(18, listEighteen);
        mapFromTwo.put(19, listNineteen);
        mapFromTwo.put(20, listTwenty);

        System.out.println(mapFromTwo);

    }

}
