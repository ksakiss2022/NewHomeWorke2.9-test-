package HomeWorke2_9;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Number {
    //Задание 2
    //Создайте множество целых чисел. Заполните множество 20 случайными числами в диапазоне от 0 до 1000.
    //
    //Пройдитесь по всем элементам множества и удалите из него все нечетные значения.
    // Выведите оставшиеся элементы в консоль.
//    public static Set<Integer> createSet() {
//        Set<Integer> newSet = new HashSet<>();
//        for (int i = 1; i <= 20; i++) {
//            newSet.add((int) Math.round(Math.random() * 1000));
//        }
//        return newSet;
//    }

//    public static Set<Integer> removeAllNumbersGreaterNotEven(Set<Integer> set) {
//        // set.removeIf(num -> num > 10);
//        set.removeIf(num -> num % 2 == 0);
//        return set;
//    }

//    public static void main(String[] args) {

    // }
    public static Set<Integer> createSet() {
        Set<Integer> newSet = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            newSet.add((int) Math.round(Math.random() * 1000));
        }
        return newSet;

    }


    public static Set<Integer> removeAllNumbersGreaterNotEven(Set<Integer> set) {

        set.removeIf(num -> num % 2 != 0);
        return set;
    }

    public static void main(String[] args) {

    }

}


