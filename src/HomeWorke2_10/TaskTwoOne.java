package HomeWorke2_10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TaskTwoOne {
   private static final Map<String, List<Integer>> mapFrom = new HashMap<>();
   private static final Map<String,Integer> mapTo=new HashMap<>();

   public static void main (String[]args){
       Random random = new Random();
       var listOne= new java.util.ArrayList<>(List.of(2,4,6,8,10));
           for (int i=0; 1< 15; i++){
               listOne.add(random.nextInt(), 5);
       }
       var listTwo= new java.util.ArrayList<>(List.of(2,4,6,8,10));
       for (int i=0; 1< 15; i++){
           listTwo.add(random.nextInt(), 5);
       }
       var listThree= new java.util.ArrayList<>(List.of(2,4,6,8,10));
       for (int i=0; 1< 15; i++){
           listThree.add(random.nextInt(), 5);
       }
       mapFrom.put("Первый список 1:", listOne);
       mapFrom.put("Первый список 2:", listTwo);
       mapFrom.put("Первый список 3:", listThree);
       System.out.println(mapFrom);

       for (var keySet:mapFrom.keySet()){
           Integer sum=0;
           List<Integer> tempList=mapFrom.get(keySet);
           for (Integer integerSum:tempList){
               sum+=integerSum;
           }
           mapTo.put(keySet,sum);

       }
       System.out.println(mapTo);
   }

}
//Задание 1
//Создайте Map<String, List<Integer>>. Заполните ее 5 элементами, где ключ — произвольное значение, а значение — список, состоящий из 3 случайных чисел в диапазоне от 0 до 1000.
//
//Преобразуйте созданную коллекцию в новую — Map<String, Integer>, где ключи взяты из первой коллекции, а число — сумма чисел списка. Выведите результат в консоль.
//
//Пример:
//
//"string1" —> [1, 6, 12]
//"string2" —> [200, 150, 350]
//Новая коллекция станет:
//
//"string1" —> 19
//"string2" —> 700