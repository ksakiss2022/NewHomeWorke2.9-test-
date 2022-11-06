package animals;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {

    private String nickname;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return birdYear == animals.birdYear && Objects.equals(nickname, animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, birdYear);
    }

    //    private int numberOfYears;
    private int birdYear;

    public Animals(String nickname, int numberOfYears) {
        setNickname(nickname);

        if (numberOfYears >= 0) {
            this.birdYear = LocalDate.now().getYear() - numberOfYears;
        } else {
            this.birdYear = LocalDate.now().getYear() - Math.abs(numberOfYears);
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
        if (nickname == null && !nickname.isBlank() && !nickname.isBlank()) {
            this.nickname = "Кликчка не известна";
        }
    }

    public int getNumberOfYears() {
        return LocalDate.now().getYear() - birdYear;
    }


    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public void printAnimals() {
        System.out.println("Кличка животного - " + nickname);
        System.out.println("Возраст животного - " + getNumberOfYears());
        eat();
        sleep();
        move();
    }

}
