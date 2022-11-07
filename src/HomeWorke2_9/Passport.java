package HomeWorke2_9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Passport {


    //Задание
    //В некоторых гос. структурах многих стран есть возможность вбить
    // номер паспорта и получить информацию о том, кому он принадлежит.
    //
    //Напишите программу, которая содержит в себе упрощенный функционал этой системы.
    //
    //Создайте класс Passport, содержащий в себе поля:
    //
    //«Номер паспорта» (уникальное, неповторяющееся значение);
    //«Фамилия»;
    //«Имя»;
    //«Отчество» (если имеется; может быть пустым);
    //«Дата рождения».
    //Выберите структуру данных, подходящую для хранения и получения (по номеру паспорта) объектов класса Passport.
    // Реализуйте 2 метода:
    //
    // Принимает объект класса Passport и сохраняет его в коллекцию. В случае если в коллекции уже есть паспорт
    // с данным номером, необходимо обновить остальные поля класса (фамилию, имя и т. д.)
    // Принимает номер паспорта, ищет в коллекции объект с данным номером и возвращает весь объект.
    // Если объект не найден, возвращает null.
    private int number;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String dataOfBirth;


    private static List<Passport> listOfPassport = new ArrayList<Passport>();

    public Passport(int number, String lastName, String firstName, String dataOfBirth) {
        this.number = number;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = null;
        this.dataOfBirth = dataOfBirth;
    }

    public Passport(int number, String lastName, String firstName, String patronymic, String dataOfBirth) throws CheckingPassportNumber, LastNameVerification, NameVerification {
        if (number <= 0) {
            throw new CheckingPassportNumber("В номере паспорта 10 цифр.");
        } else {
            this.number = number;
        }
        if (lastName == null && lastName.isEmpty() && lastName.isBlank()) {
            throw new LastNameVerification("Фамилия введена не корректно");
        } else {
            this.lastName = lastName;
        }
        if (firstName == null && firstName.isEmpty() && firstName.isBlank()) {
            throw new NameVerification("Имя введено не корректно.");
        } else {
            this.firstName = firstName;
        }

        this.patronymic = patronymic;
        if (dateValue(dataOfBirth) == null) {
            System.out.println("Введите дату рождения в формате \"dd.MM.yyyy\"");
        } else {
            this.dataOfBirth = dataOfBirth;
        }

    }

    public static Date dateValue(String date) {
        try {
            return new SimpleDateFormat("dd.MM.yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }

    }

    public static void addListNewPassport(Passport newListNewPassport) {
        boolean checkNewPassport = true;
        for (Passport passport : listOfPassport) {
            if (passport.getNumber() == newListNewPassport.getNumber()) {
                passport.setName(newListNewPassport.getName());
                passport.setSurname(newListNewPassport.getSurname());
                passport.setPatronymic(newListNewPassport.getPatronymic());
                passport.setDataOfBirth(newListNewPassport.getDataOfBirth());
                checkNewPassport = false;
                break;
            }
        }
        if (checkNewPassport) {
            listOfPassport.add(newListNewPassport);
        }
    }

    public static Passport lookingForAPassport(Passport newlookingForAPassport) {
        for (Passport passport : listOfPassport) {
            if (passport.getNumber() == newlookingForAPassport.getNumber()) {
                return newlookingForAPassport;
            }
        }
        return null;
    }

    public static void printPassports() {
        System.out.println("Паспорта:");
        for (Passport passport : listOfPassport) {
            System.out.println(passport);
        }
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSurname() {
        return lastName;
    }

    public void setSurname(String surname) {
        this.lastName = surname;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        if (dateValue(dataOfBirth) == null) {
            System.out.println("введите дату рождения в формате \"dd.MM.yyyy\"");
        } else {
            this.dataOfBirth = dataOfBirth;
        }

    }

    public static List<Passport> getListOfPassport() {
        return listOfPassport;
    }

    public static void setListOfPassport(List<Passport> listOfPassport) {
        Passport.listOfPassport = listOfPassport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number && lastName.equals(passport.lastName) && firstName.equals(passport.firstName) && patronymic.equals(passport.patronymic) && dataOfBirth.equals(passport.dataOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, lastName, firstName, patronymic, dataOfBirth);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", surname='" + lastName + '\'' +
                ", name='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                '}';
    }

    public static void main(String[] args) throws CheckingPassportNumber, LastNameVerification, NameVerification {


        Passport.addListNewPassport(new Passport(49812312, "Зайцев", "Александр", "Александрович", "16.12.2000"));
        Passport.addListNewPassport(new Passport(49812312, "Чибисова", "Анна", "Александровна", "10.09.1999"));
        Passport.addListNewPassport(new Passport(49812312, "Дубова", "Оксана", "Евгеньевна", "22.11.1989"));
        Passport.addListNewPassport(new Passport(49812312, "Забалуева", "Ольга", "19.09.1985"));
        Passport.addListNewPassport(new Passport(49812312, "Цой", "Олег", "31.07.1990"));
        Passport.addListNewPassport(new Passport(49812312, "Вешкин", "Евгений", "31.03.2008"));
        Passport.addListNewPassport(new Passport(49812312, "Шведова", "Елена", "19.05.1979"));

        Passport.printPassports();
        System.out.println();
        System.out.println("Поиск паспорта по ");
        System.out.println(Passport.lookingForAPassport(new Passport(49812312, "Вешкин", "Евгений", "31.03.2008")));

    }
}

