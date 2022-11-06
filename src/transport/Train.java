package transport;

import java.util.Timer;

public class Train extends Transport {

     private double thePriceOfTheTrip;
    //Цена поездки
    private Integer travelTime;
    //Время поездки
    private String nameOfTheDepartureStation;
    //   Название станции отбытия
    private String finalStop;
    //Конечная остановка
    private int numberOfWagons;

    public Train(String brand, String model) {
        super(brand, model);
    }

    public Train(String brand, String model, float engineCapacity) {
        super(brand, model, engineCapacity);
    }


    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 int movementSpeed,
                 double thePriceOfTheTrip,
                 String nameOfTheDepartureStation,
                 String finalStop,
                 int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, movementSpeed);

        this.thePriceOfTheTrip = thePriceOfTheTrip;
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
  }

    @Override
    public void startMovement() {

    }

    @Override
    public void endMovement() {

    }

    @Override
    public boolean diagnosticTransport() {
        return false;
    }

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int movementSpeed) {
        super(brand, model, productionYear, productionCountry, color, movementSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Необходимо заправить дизелем");
//Объекты класса train нужно заправлять дизелем.
    }


    public double getThePriceOfTheTrip() {
        return thePriceOfTheTrip;
    }

    public void setThePriceOfTheTrip(double thePriceOfTheTrip) {
        if (thePriceOfTheTrip <= 0) {
            this.thePriceOfTheTrip = 500;
        } else {
            this.thePriceOfTheTrip = Math.abs(thePriceOfTheTrip);
        }
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        if (travelTime <= 0) {
            this.travelTime = 60;
        } else {
            this.travelTime = Math.abs(travelTime);
        }
    }

    public String getNameOfTheDepartureStation() {
        return nameOfTheDepartureStation;
    }

    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
        if (nameOfTheDepartureStation != null
                && !nameOfTheDepartureStation.isEmpty() &&
                !nameOfTheDepartureStation.isBlank()) {
            this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        } else {
            this.nameOfTheDepartureStation = "пункт прибытия не определен";
        }
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop != null && !finalStop.isBlank() && !finalStop.isEmpty()) {
            this.finalStop = finalStop;
        } else {
            this.finalStop = "пункт отправления не определен";
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0) {
            this.numberOfWagons = 10;
        } else {
            this.numberOfWagons = Math.abs(numberOfWagons);
        }

    }

    public void train() {
        super.transport();
        System.out.print("Стоимость поездки " + getThePriceOfTheTrip() + ", ");
        System.out.print("отходит от " + getNameOfTheDepartureStation() + ", ");
        System.out.println("следует до стации " + getFinalStop() + ", ");
        System.out.println("в поезде " + getNumberOfWagons() + " вагонов");


    }
    @Override
    public void service() {
        System.out.println("Трамвай - "+ getBrand()+", "+getModel()+" прошел техническое обслуживаение.");
    }
    @Override
    public void repair() {
        System.out.println(getBrand()+", "+getModel()+" требует ремонта.");
    }

}
