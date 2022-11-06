package transport;

import java.util.Arrays;
import java.util.Objects;

public class Bus extends Transport implements Competing {

    public static final String FIRST_SPEED_CHECK_IN_BUS = "Совершить первую поездку по маршруту.";
    public static final String SECOND_SPEED_CHECK_IN_BUS = "Совершить вторую поездку по маршруту в час пик.";
    public static final String THIRD_SPEED_CHECK_IN_BUS = "Совершить третью поездку по маршруту со всеми остановками в час пик.";
    public static final String[] MAX_BUS_STRING = new String[]{FIRST_SPEED_CHECK_IN_BUS, SECOND_SPEED_CHECK_IN_BUS, THIRD_SPEED_CHECK_IN_BUS};

    public static final String FIRST_TAKE_A_BREAK = "1 перерыв на обед";
    public static final String SECOND_TAKE_A_BREAK = "2 перерыв на отдых";
    public static final String THIRD_TAKE_A_BREAK = "3 перерыв на ужин";

    public static final String[] ALL_TAKE_A_BREAK = new String[]{FIRST_TAKE_A_BREAK, SECOND_TAKE_A_BREAK, THIRD_TAKE_A_BREAK};
    public String[] time = new String[0];
    private int fare;
    private BusCapacity busCapacity;


    public Bus(String brand, String model, float engineCapacity, int fare, BusCapacity busCapacity) {
        super(brand, model, engineCapacity);
        setFare(fare);
        this.busCapacity = busCapacity;

    }

    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               int movementSpeed) {
        super(brand, model, productionYear, productionCountry, color, movementSpeed);

    }

    public int getFare() {
        return fare;
    }

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public String[] getTime() {
        return time;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    public void setTime(String[] time) {
        this.time = time;
    }

    public void setFare(int fare) {
        this.fare = fare;
        if (fare <= 0) {
            this.fare = 55;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return fare == bus.fare;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fare);
    }

    @Override
    public void printType() {
        if (busCapacity == null) {
            System.out.println("Данных по автобусу нет");
        } else {

            System.out.println(busCapacity.typeOfCapacity + " от " + busCapacity.getFrom() + " до " + busCapacity.getTo());
        }
    }

    @Override
    public boolean diagnosticTransport() {
        return false;
    }


    @Override
    public void startMovement() {
        System.out.println("Начать движение, проверив безопасность пасажиров.");

    }

    @Override
    public void endMovement() {
        System.out.println("Закончить движение, проверить безопасноть пасажиров.");

    }

    @Override
    public String[] getPitStop() {
        return ALL_TAKE_A_BREAK;
    }

    @Override
    public String[] getBestLapTime() {
        return time;
    }

    @Override
    public String[] getMaximumSpeed() {
        return MAX_BUS_STRING;
    }

    @Override
    public void trainMaxSpeed(String checkInForSpeed) {
        System.out.println("Выполняю тренировку Автобуса.");
        switch (checkInForSpeed) {
            case FIRST_SPEED_CHECK_IN_BUS:
                System.out.println("Отработана перваяы поездка по маршруту.");
                break;
            case SECOND_SPEED_CHECK_IN_BUS:
                System.out.println("Отработана вторая поездка по маршруту в час пик.");
                System.out.println("Достигнута максимальная скорость, при минимальном риске для пассажиров.");
                break;
            case THIRD_SPEED_CHECK_IN_BUS:
                System.out.println("Отработана третья поездка по маршруту со всеми остановками в час пик.");
                System.out.println("Достигнут лучший результат, отработана посадка-высадка пассажиров.");
                break;
            default:
                System.out.println("Не заложена такая тренировка для автобусов.");

        }
    }


    @Override
    public void trainlaptime(String lapTime) {
        time = Arrays.copyOf(time, time.length + 1);
        time[time.length - 1] = lapTime;
        System.out.println("Время заезда составило- " + lapTime);
    }

    @Override
    public void trainPitStop(String checkPitStop) {
        System.out.println("Отрабатываю Пит-Стоп для автобусов");
        switch (checkPitStop) {
            case FIRST_TAKE_A_BREAK:
                System.out.println("Совершаю перерыв между поездками.");
                break;
            case SECOND_TAKE_A_BREAK:
                System.out.println("Совершаю второй перерыв между поездками.");
                System.out.println("Обедаю, проверяю исправность автобуса.");
                break;
            case THIRD_TAKE_A_BREAK:
                System.out.println("Совершаю тертий перерыв между поездками.");
                System.out.println("Считаю выручку за день.");
                break;
            default:
                System.out.println("Не заложен перерыв для автобусов.");

        }

    }


    public void collectMoneyForTravel() {
        System.out.println("Собрать деньги за проезд");
    }

    @Override
    public void service() {
        System.out.println("Автобус- "+ getBrand()+", "+getModel()+" прошел техническое обслуживаение.");
    }

    @Override
    public void refill() {
        System.out.println("Заправлять бензином или дизелем на заправке.");
    }

    @Override
    public void repair() {
        System.out.println(getBrand()+", "+getModel()+" требует ремонта.");
    }

    public void printBus() {
        super.printTransport();
        System.out.println("Стоимость проезда " + fare);
        collectMoneyForTravel();
    }

    public void bus() {
        super.transport();
    }

}
