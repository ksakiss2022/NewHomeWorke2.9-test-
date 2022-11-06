package animals;

import java.util.Objects;

public class Amphibious extends Animals{


    private String habitat;

    public Amphibious(String nickname,
                      int numberOfYears,
                      String habitat) {
        super(nickname, numberOfYears);
        this.habitat=habitat;
        if (habitat == null && !habitat.isBlank() && !habitat.isEmpty()) {
            this.habitat = "Среда обетания не определена ";
        }
    }
//среда обитания


    public static void hunting() {
        System.out.println("Охотится в одиночку");
        //охотится
    }
        public String getHabitat() {
            return habitat;
        }


    @Override
    public void eat() {
        System.out.println("Добывают пищу в среде обитания ");

    }

    @Override
    public void sleep() {
        System.out.println("Спят в защищенном от хищников месте");

    }

    @Override
    public void move() {
        System.out.println("Передвигается и по суши и по воде");

    }
    public void printAmphibious() {
        super.printAnimals();
        System.out.println("Среда обитания - " + habitat);
        hunting();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibious that = (Amphibious) o;
        return Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
