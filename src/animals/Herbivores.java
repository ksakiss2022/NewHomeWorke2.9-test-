package animals;

import java.util.Objects;

public class Herbivores extends Mammals {

    public Herbivores(String nickname,
                      int numberOfYears,
                      String habitat,
                      int speedOfMovement,
                      String foodType) {
        super(nickname, numberOfYears, habitat, speedOfMovement);
        setFoodType(foodType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(foodType, that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    private String foodType;

    //тип пищи
    public void eat() {
        System.out.println("Еда - "+"постоянно потребляет растительную пищу");
    }

    public void move() {
        System.out.println("Перемещаются сезонно, вслед за растительной пищей");
    }
    public static void graze() {
        //пастись
        System.out.println("Пасутся стадами");
    }


    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
        if (foodType == null && !foodType.isEmpty() && !foodType.isBlank()) {
            this.foodType = "тип пищи не определен";
        }
    }

    public void printHerbivores() {
        super.printMammals();
        System.out.println("Тип еды - " + foodType);
        eat();
        graze();
        move();
    }

    @Override
    public void walk() {
        System.out.println("Гуляет днем");

    }
}
