package transport;

public interface Competing {

    String[] getPitStop();

    //Пит-стоп
    String[] getBestLapTime();
    // Лучшее время круга

    String[] getMaximumSpeed();

    // Максимальная скорость
    void trainMaxSpeed(String maxSpeed);

    //заезды на скорость
    void trainlaptime(String lapTime);
    //заезды на время

    void trainPitStop(String pitStop);
}
