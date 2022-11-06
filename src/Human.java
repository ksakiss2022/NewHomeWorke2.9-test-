public class Human {

    private int yearOfBirth;
    String name;
    String town;
    String job;

    Human(int setyearOfBirth, String name, String settown, String job) {
        this.job = job;
        this.name = name;
        if (name == null) {
            this.name = "Информация не указана";
        }
        this.town = settown;
        this.yearOfBirth = setyearOfBirth;
    }


    void human() {

        System.out.print("Привет! Меня зовут " + name + ". ");
        System.out.print("Я из города " + town + ". ");
        System.out.print("Мне " + yearOfBirth + " лет. ");
        System.out.println("Я работаю на должности" + job + ". Будем знакомы!");
        System.out.println();
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }
}
