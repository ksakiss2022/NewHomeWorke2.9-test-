package animals;

import java.util.Objects;

public class Predators extends Mammals {
    public Predators(String nickname,
                     int numberOfYears,
                     String habitat,
                     int speedOfMovement,
                     String foodType) {
        super(nickname, numberOfYears, habitat, speedOfMovement);
        setFoodType(foodType);
    }

    private String foodType;

    //тип пищи
    public void eat() {
        System.out.println("Еда - " + "потреюляет в пищу пойманную добычу, падаль");
    }

    public void move() {
        System.out.println("Перемещаются вслед за добычей ");
    }

    public static void hunt() {
        //охотиться
        System.out.println("Охотятся");
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

    public void printPredators() {
        super.printMammals();
        System.out.println("Тип еды - " + foodType);
        eat();
        hunt();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(foodType, predators.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public void walk() {
        System.out.println("Гуляют ночью");

    }
}

