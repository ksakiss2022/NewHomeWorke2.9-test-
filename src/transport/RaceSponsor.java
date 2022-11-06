package transport;

public class RaceSponsor {

    private final int amount;
    private final String name;


    public RaceSponsor(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Спонсор: " +
                ", сумма спонсорской поддержки: " + amount +
                ", наименование компании спонсора : " + name;
    }

    public String getName() {
        return name;
    }

    public void printRaceSponsor() {
        System.out.println("Спонсор- " + name + " оказал помощь в размкере: " + amount);
    }
}
