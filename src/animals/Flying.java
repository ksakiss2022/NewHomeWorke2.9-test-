package animals;

public class Flying extends Birds {


    private String typeOfMovement;

    public Flying(String nickname,
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

    public void toFly() {
        System.out.println("Летают днем ");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
        //тип передвижения
    }

    @Override
    public void hunting() {
        System.out.println("Добывают себе пищу днем ");
    }

    public void printFlying() {
        super.printBirds();
        System.out.println("Тип передвижения" + typeOfMovement);
        toFly();
    }
}
