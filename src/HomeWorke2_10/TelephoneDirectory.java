package HomeWorke2_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TelephoneDirectory {


  private static Map<String, String> directoryMap = new HashMap<>();

  public TelephoneDirectory(Map<String, String> directoryMap) {
    this.directoryMap = directoryMap;
  }

  public Map<String, String> getDirectoryMap() {
    return directoryMap;
  }

  public TelephoneDirectory() {

  }
  //    public static void addTooutput(String str, Integer count) {
  //        if (output.containsKey(str) && output.get(str).equals(count)) {
  //            throw new RuntimeException("Ошибка.");
  //        }
  //        output.put(str, count);
  //    }

  public static void addDirectiryToMap(String strOne, String strTwo) {
    directoryMap.put(strOne,strTwo);
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TelephoneDirectory directory = (TelephoneDirectory) o;
    return Objects.equals(directoryMap, directory.directoryMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryMap);
  }
  @Override
  public String toString() {
    return "TelephoneDirectory{" +
            "directoryMap=" + directoryMap +
            '}';
  }
  public static void main(String[] args){
    TelephoneDirectory directory = new TelephoneDirectory();
    directory.addDirectiryToMap("Чибисова Анна", " 8-925-122-44-55");
    directory.addDirectiryToMap("Забалуева Ольга","8-916-478-21-56");
    directory.addDirectiryToMap("Дубова Марина","8-910-222-33-99");
    directory.addDirectiryToMap("Шавнев Андрей","8-916-765-87-98");
    directory.addDirectiryToMap("Филиммонова Екатерина","8-910-722-55-00");
    directory.addDirectiryToMap("Бажибаева Дина","8-910-666-55-01");
    directory.addDirectiryToMap("Осташенко Наталья","8-000-666-55-32");
    directory.addDirectiryToMap("Нечаева Екатерина","8-910-765-55-32");
    directory.addDirectiryToMap("Федорчук Сергей","8-910-666-55-00");
    directory.addDirectiryToMap("Антипов Егор","8-910-765-55-12");
    directory.addDirectiryToMap("Чепрасов Дмитрий","8-910-987-55-09");
    directory.addDirectiryToMap("Чудаков Сергей","8-908-666-55-67");
    directory.addDirectiryToMap("Поцелуева Наталья","8-910-888-55-44");
    directory.addDirectiryToMap("Коробейникова Светлана","8-234-111-55-32");
    directory.addDirectiryToMap("Лобадина Светлана","8-098-456-55-32");
    directory.addDirectiryToMap("Белянков Никита","8-099-999-55-32");
    directory.addDirectiryToMap("Дружнов Сергей","8-567-778-55-32");
    directory.addDirectiryToMap("Ивлев Валентин","8-903-654-55-32");
    directory.addDirectiryToMap("Вешкин Петр","8-999-666-55-32");
    directory.addDirectiryToMap("Сорокина Анна","8-910-876-55-32");
    System.out.println(directory);
  }


}

//Задание 1
//Напишите приложение «Телефонный справочник», используя HashMap:
//
//В качестве ключа коллекция принимает значение «Имя и Фамилия», а в качестве значения коллекции — номер телефона.
//
//Добавьте 20 произвольных значений в мапу, выведите все значения в консоль