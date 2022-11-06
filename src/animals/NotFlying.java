package animals;

public class NotFlying extends Birds {


    private String typeOfMovement;

    public NotFlying(String nickname,
                  int numberOfYears,
                  String habitat,
                  String typeOfMovement) {
        super(nickname, numberOfYears, habitat);
        this.typeOfMovement = typeOfMovement;
        if (typeOfMovement == null && !typeOfMovement.isBlank() && !typeOfMovement.isEmpty()) {
            this.typeOfMovement = "Тип передвижения не определен";
        }
    }
    //тип передвижения

    public void walk() {
        System.out.println("Гуляют днем ");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
        //тип передвижения
    }

    @Override
    public void hunting() {
        System.out.println("Охотятся днем ");
    }

    public void printNotFlying() {
        super.printBirds();
        System.out.println("Тип передвижения" + typeOfMovement);
        walk();
    }
}
