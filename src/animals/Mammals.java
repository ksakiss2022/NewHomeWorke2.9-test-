package animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    public Mammals(String nickname, int numberOfYears, String habitat, int speedOfMovement) {
        super(nickname, numberOfYears);
        this.habitat = habitat;
        if (habitat == null && !habitat.isBlank() && !habitat.isEmpty()) {
            this.habitat = "Среда обетания не определена ";
        }
        this.speedOfMovement = speedOfMovement;
        if (speedOfMovement < 0) {
            System.out.println("Cкорость не определена");
        }
    }

    private String habitat;
    //среда обитания
    private int speedOfMovement;
    //скорость передвижения

    public String getHabitat() {
        return habitat;
    }

    public int getSpeedOfMovement() {
        return speedOfMovement;
    }


    public abstract void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speedOfMovement == mammals.speedOfMovement && Objects.equals(habitat, mammals.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speedOfMovement);
    }

    @Override
    public void eat() {
        System.out.println("Кушает добытую пищу");

    }

    @Override
    public void sleep() {
        System.out.println("Спит в защищенном месте");

    }

    @Override
    public void move() {
        System.out.println("Перемещается в места богатые пищей");

    }

    public void printMammals() {
        super.printAnimals();
        System.out.println("Среда обитания - " + habitat);
        System.out.println("Скорость передвижения - " + speedOfMovement+" км/ч");
        walk();
    }
}
