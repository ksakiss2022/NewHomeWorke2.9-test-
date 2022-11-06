package animals;

public abstract class Birds extends Animals{

    private String habitat;

    public Birds(String nickname, int numberOfYears, String habitat) {
        super(nickname, numberOfYears);
        this.habitat=habitat;
        if (habitat == null && !habitat.isBlank() && !habitat.isEmpty()) {
            this.habitat = "Среда обетания не определена ";
        }

    }
    //среда обитания

    public abstract void hunting();
        //охотится

    public String getHabitat() {
        return habitat;
    }

    @Override
    public void eat() {
        System.out.println("Питаются насекомыми, мелкими грызунами");

    }

    @Override
    public void sleep() {
        System.out.println("Спят ночью");

    }

    @Override
    public void move() {
        System.out.println("Летают по небу");

    }
    public void printBirds() {
        super.printAnimals();
        System.out.println("Среда обитания - " + habitat);
        hunting();
    }
}
