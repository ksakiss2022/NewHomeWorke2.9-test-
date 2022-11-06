package transport;

import Driver.Driver;
import HomeWorke2_7.PassDiagnosticsException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport {


    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();


    private final List<RaceSponsor> raceSponsors = new ArrayList<>();

    public void addDriver(Driver<?> ...drivers) {

        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addRaceSponsor(RaceSponsor... raceSponsor) {
       this.raceSponsors.addAll(Arrays.asList(raceSponsor));
    }

    private String brand;
    private String model;
    private float engineCapacity;
    private int movementSpeed;
    protected int productionYear;
    protected String productionCountry;
    protected String color;

    public abstract void refill();

    public abstract void repair();

    public abstract void service();


    public abstract void startMovement();

    //начать движение
    public abstract void endMovement();
    //закончить движение

    public Transport(String brand, String model) {
        setBrand(brand);
        setModel(model);

    }

    public Transport(String brand, String model, float engineCapacity) {
        setBrand(brand);
        setModel(model);
        setEngineCapacity(engineCapacity);
    }

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     int movementSpeed) {
        setBrand(brand);
        setModel(model);
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setMovementSpeed(movementSpeed);
    }

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int movementSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }
        this.productionCountry = productionCountry;
        if (productionCountry == null) {
            this.productionCountry = "страна производства не задана";
        }
        this.color = color;
        this.movementSpeed = movementSpeed;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }
    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    @Override
    public String toString() {
        return "Транспорт: " +
                ", марка: " + brand +
                ", модель: " + model +
                ", мощность двигателя =" + engineCapacity +
                ", скорость движения =" + movementSpeed +
                ", год выпуска: " + productionYear +
                ", страна производства: " + productionCountry + '\'' +
                ", цвет: " + color;
    }

    public List<RaceSponsor> getRaceSponsors() {
        return raceSponsors;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        if (brand == null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = "Марка автомобиля не задана";
        }
    }

    public void setModel(String model) {
        this.model = model;
        if (model == null && !model.isBlank() && !model.isEmpty()) {
            this.model = "Модель автомобиля не задана";
        }
    }

    public void setEngineCapacity(float engineCapacity) {
        if (engineCapacity <= 0) {
            this.engineCapacity = 1.5f;
        } else {
            this.engineCapacity = Math.abs(engineCapacity);
        }
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
        if (movementSpeed <= 0) {
            this.movementSpeed = 100;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return engineCapacity == transport.engineCapacity && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

    public void printTransport() {
        System.out.println("Марка транспортного средства- " + brand + ",");
        System.out.println("модель транспортного средства- " + model + ", ");
        System.out.println("объем двигателя- " + engineCapacity + ".");
        startMovement();
        endMovement();
    }

    public void printType() {

    }

    public void printBrandModel() {
        System.out.println("Марка транспортного средства- " + brand + ",");
        System.out.println("модель транспортного средства- " + model + ", ");
        startMovement();
        endMovement();

    }


//    public abstract class Refill {
//        private boolean refuelingWithElectricity;
//        private boolean refuelingWithGasoline;
//        private boolean refuelingWithDieselFuel;
//
//        public Refill(boolean refuelingWithElectricity, boolean refuelingWithGasoline, boolean refuelingWithDieselFuel) {
//            setRefuelingWithDieselFuel(refuelingWithDieselFuel);
//            setRefuelingWithElectricity(refuelingWithElectricity);
//            setRefuelingWithGasoline(refuelingWithGasoline);
//        }
//
//        public boolean isRefuelingWithElectricity() {
//            return refuelingWithElectricity;
//        }
//
//        public void setRefuelingWithElectricity(boolean refuelingWithElectricity) {
//            this.refuelingWithElectricity = refuelingWithElectricity;
//            if (refuelingWithElectricity == true) {
//                this.refuelingWithElectricity = refuelingWithElectricity;
//            } else {
//                System.out.println("---");
//            }
//
//        }
//
//        public boolean isRefuelingWithGasoline() {
//            return refuelingWithGasoline;
//        }
//
//        public void setRefuelingWithGasoline(boolean refuelingWithGasoline) {
//            this.refuelingWithGasoline = refuelingWithGasoline;
//            if (refuelingWithGasoline == true) {
//                this.refuelingWithGasoline = refuelingWithGasoline;
//            } else {
//                System.out.println("---");
//            }
//        }
//
//
//        public boolean isRefuelingWithDieselFuel() {
//            return refuelingWithDieselFuel;
//        }
//
//        public void setRefuelingWithDieselFuel(boolean refuelingWithDieselFuel) {
//            this.refuelingWithDieselFuel = refuelingWithDieselFuel;
//            if (refuelingWithDieselFuel == true) {
//                this.refuelingWithDieselFuel = refuelingWithDieselFuel;
//            } else {
//                System.out.println("---");
//            }
//        }

//    public abstract void refill();
//
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//        if (brand == null) {
//            this.brand = "default";
//        }
//    }
//
//    public String getModel() {
//        return model;
//
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//        if (model == null) {
//            this.model = "default";
//        }
//    }
//
//    public int getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//        if (color == null && !color.isEmpty() && !color.isBlank()) {
//            this.color = color;
//        } else {
//            this.color = "Информация не указана";
//        }
//    }
//


    //    public void transport() {
//
//        System.out.print("Вид трансорта " + getBrand() + ", ");
//        System.out.print("модель " + getModel() + ", ");
//        System.out.print("год выпуска " + getProductionYear() + ", ");
//        System.out.print("страна производитель " + getProductionCountry() + ", ");
//        System.out.print("скорость передвижения " + getMovementSpeed() + ". ");
//        System.out.println();
//    }
    public abstract boolean diagnosticTransport() throws PassDiagnosticsException;


    protected void transport() {
    }
}

