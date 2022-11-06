package transport;

import HomeWorke2_7.PassDiagnosticsException;

import java.util.Arrays;
import java.util.Objects;

public class TrucksCar extends Transport implements Competing {

    private String color;
    public static final String FIRST_SPEED_CHECK_IN = "Совершить первый заезд на скорость на треке.";
    public static final String SECOND_SPEED_CHECK_IN = "Совершить второй заезд на скорость по горной метности.";
    public static final String THIRD_SPEED_CHECK_IN = "Совершить третий заезд на скорость по пересеченной местности.";
    public static final String[] MAX_SPEED = new String[]{FIRST_SPEED_CHECK_IN, SECOND_SPEED_CHECK_IN, THIRD_SPEED_CHECK_IN};
    public static final String FIRST_PIT_STOP = "1 перерыв на обед";
    public static final String SECOND_PIT_STOP = "2 перерыв на отдых";
    public static final String THIRD_PIT_STOP = "3 перерыв на ужин";

    public static final String[] ALL_PIT_STOP = new String[]{FIRST_PIT_STOP, SECOND_PIT_STOP, THIRD_PIT_STOP};
    private String[] bestTime = new String[0];

    public String[] getBestTime() {
        return bestTime;
    }

    public void setBestTime(String[] bestTime) {
        this.bestTime = bestTime;
    }



    private CapacityTruck capacityTruck;
    public TrucksCar(String brand, String model, float engineCapacity, String color,CapacityTruck capacityTruck) {
        super(brand, model, engineCapacity);
        setColor(color);
        this.capacityTruck=capacityTruck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrucksCar trucksCar = (TrucksCar) o;
        return Objects.equals(color, trucksCar.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public void printType() {
        if (capacityTruck == null) {
            System.out.println("Данных по грузовому автомобилю нет");
        }else {

            System.out.println(capacityTruck.getTypeOfLoadCapacity()+" от "+capacityTruck.getFrom()+" до "+capacityTruck.getTo());
        }
    }

     public void turnOnTheHeadlights() {
        System.out.println("При движении необходимо включать фары.");

    }
    //включить фары

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (color == null && !color.isEmpty() && !color.isBlank()) {
        }

    }


    @Override
    public void refill() {

    }

    @Override
    public void startMovement() {
        System.out.println("Начать движение.");

    }

    @Override
    public void endMovement() {
        System.out.println("Закончить движение.");

    }

    public void printTrucksCar() {
        super.printTransport();
        System.out.println("Цвет автомобиля- " + color + ", ");
        startMovement();
        endMovement();
        turnOnTheHeadlights();
    }


    @Override
    public String[] getPitStop() {
        return ALL_PIT_STOP;
    }

    public CapacityTruck getCapacityTruck() {
        return capacityTruck;
    }

    public void setCapacityTruck(CapacityTruck capacityTruck) {
        this.capacityTruck = capacityTruck;
    }
    @Override
    public String[] getBestLapTime() {
        return bestTime;
    }

    @Override
    public String[] getMaximumSpeed() {
        return MAX_SPEED;
    }

    @Override
    public void trainMaxSpeed(String checkInForSpeed) {
        System.out.println("Выполняю тренировку Грузового транспорта.");
        switch (checkInForSpeed) {
            case FIRST_SPEED_CHECK_IN:
                System.out.println("Отработана тренировка на треке на максимальную скорость.");
                System.out.println("Зафиксирован лучший результат.");
                break;
            case SECOND_SPEED_CHECK_IN:
                System.out.println("Отработана тренировка на скорость в условиях горной местности.");
                System.out.println("Достигнута максимальная скорость, зафиксирован результат.");
                break;
            case THIRD_SPEED_CHECK_IN:
                System.out.println("Отработана тренировка на максимальную скорость по пересеченной местности");
                break;
            default:
                System.out.println("Нет такой тренировки");
        }

    }


    @Override
    public void trainlaptime(String lapTime) {
        bestTime = Arrays.copyOf(bestTime, bestTime.length + 1);
        bestTime[bestTime.length - 1] = lapTime;
        System.out.println("Время на выполнение тренировки составило- " + lapTime);
    }

    @Override
    public void trainPitStop(String pitStop) {

    }


    int yearDiagnostic;
    public TrucksCar(String brand, String model, float engineCapacity, int yearDiagnostic) {
       super(brand, model, engineCapacity);
       this.yearDiagnostic = yearDiagnostic;
  }
    @Override
    public boolean diagnosticTransport() throws PassDiagnosticsException {
        if (yearDiagnostic>= 2020 && yearDiagnostic <= 2022){
            System.out.println("Диагностику проходить не нужно.");
       }else {
            throw new PassDiagnosticsException("Необходимо пройти диагностику.");

        }
        return false;
    }


//
//    public TrucksCar(String brand, String model, float engineCapacity, int yearDiagnostic) {
//        super(brand, model, engineCapacity);
//        this.yearDiagnostic = yearDiagnostic;
//    }

    public static boolean checkDiagnosticTruck(TrucksCar trucksCar) throws PassDiagnosticsException {

        if (trucksCar.yearDiagnostic >= 2020 && trucksCar.yearDiagnostic <= 2022){
            System.out.println("Диагностику проходить не нужно.");
        }else {
            throw new PassDiagnosticsException("Необходимо пройти диагностику.");
        }
        return false;
    }
    @Override
    public void service() {
        System.out.println("Грузовой автомобиль- "+ getBrand()+", "+getModel()+" прошел техническое обслуживаение.");
    }
    @Override
    public void repair() {
        System.out.println(getBrand()+", "+getModel()+" требует ремонта.");
    }

}