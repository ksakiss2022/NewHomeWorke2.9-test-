package HomeWorke2_10;

import java.util.*;

public class TaskTwoOne {
   private static final Map<String, List<Integer>> mapFrom = new HashMap<>();
   private static final Map<String,Integer> mapTo=new HashMap<>();

   public static void main (String[]args){
       Random random = new Random();
       //for (int i = 0; i < 10; i++) {
       //   System.out.println("Привет");
       //}
       //List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
       //
       //for (int i = 0; i < nums.size(); i++) {
       //	int currentNum = nums.get(i);
       //nums.set(i, currentNum * 2);
       //}
       List<Integer> listI=new ArrayList<>(List.of(2,4,6,8,10));
       for (int i = 0; i < listI.size(); i++) {
           int currentListI= listI.get(i);
           listI.size();
       }
//       var listOne= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//           for (int i=0; i< 15; i++){
//               listOne.add(random.nextInt(19));
//       }
//       var listTwo= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listTwo.add(random.nextInt( 10));
//       }
//       var listThree= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listThree.add(random.nextInt(10));
//       } var listfour= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listfour.add(random.nextInt( 10));
//       }
//       var listfive= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listfive.add(random.nextInt(10));
//       }
//       var listSix= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listSix.add(random.nextInt( 10));
//    }
//    var listSeven= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listSeven.add(random.nextInt(10));
//    }
//       var listEight= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listEight.add(random.nextInt(10));
//       }
//       var listNine= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listNine.add(random.nextInt(10));
//       }
//       var listTen= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listTen.add(random.nextInt(10));
//       }
//       var listEleven= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listEleven.add(random.nextInt(10));
//       }
//       var listTwelve= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listTwelve.add(random.nextInt(10));
//       }
//       var listThirteen= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listThirteen.add(random.nextInt(10));
//       }
//       var listFourteen= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listFourteen.add(random.nextInt(10));
//       }
//       var listFifteen= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listFifteen.add(random.nextInt(10));
//       }
//       var listSixteen= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listSixteen.add(random.nextInt(10));
//       }
//       var listSeventeen= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listSeventeen.add(random.nextInt(10));
//       }
//       var listEighteen= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listEighteen.add(random.nextInt(10));
//       }
//       var listNineteen= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listNineteen.add(random.nextInt(10));
//       }
//       var listTwenty= new java.util.ArrayList<>(List.of(2,4,6,8,10));
//       for (int i=0; i< 15; i++){
//           listSeventeen.add(random.nextInt(10));
//       }
//       mapFrom.put("1:", listOne);
//       mapFrom.put("2:", listTwo);
//       mapFrom.put("3:", listThree);
//       mapFrom.put("4:", listfour);
//       mapFrom.put("5:", listfive);
//       mapFrom.put("6:", listSix);
//       mapFrom.put("7:", listSeven);
//       mapFrom.put("8:", listEight);
//       mapFrom.put("9:", listNine);
//       mapFrom.put("10:", listTen);
//       mapFrom.put("11:", listEleven);
//       mapFrom.put("12:", listTwelve);
//       mapFrom.put("13", listThirteen);
//       mapFrom.put("14:", listFourteen);
//       mapFrom.put("15:", listFifteen);
//       mapFrom.put("16:", listSixteen);
//       mapFrom.put("17:", listSeventeen);
//       mapFrom.put("18:", listEighteen);
//       mapFrom.put("19:", listNineteen);
//       mapFrom.put("20:", listTwenty);

       mapFrom.put("1:", listI);
       mapFrom.put("2:", listI);
       mapFrom.put("3:", listI);
       mapFrom.put("4:", listI);
       mapFrom.put("5:", listI);
       mapFrom.put("6:", listI);
       mapFrom.put("7:", listI);
       mapFrom.put("8:", listI);
       mapFrom.put("9:", listI);
       mapFrom.put("10:", listI);
       mapFrom.put("11:", listI);
       mapFrom.put("12:", listI);
       mapFrom.put("13", listI);
       mapFrom.put("14:", listI);
       mapFrom.put("15:", listI);
       mapFrom.put("16:", listI);
       mapFrom.put("17:", listI);
       mapFrom.put("18:", listI);
       mapFrom.put("19:", listI);
       mapFrom.put("20:", listI);
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
