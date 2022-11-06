package transport;

public enum BusCapacity {
 ESPECIALLY_SMALL("особо малая (до 10 мест)",0.0,10.0),
        SMALL("малая (до 25)",10.0,25.0),
        AVERAGE("средняя (40–50)",40.0,50.0),
        BIG("большая (60–80)",60.0,80.0),
        ESPECIALLY_BIG("особо большая (100–120 мест)",100.0,120.0);



    public final String typeOfCapacity;
    private Double from;

    public Double getFrom() {
        return from;
    }

    public void setFrom(Double from) {
        this.from = from;
    }

    public Double getTo() {
        return to;
    }

    public void setTo(Double to) {
        this.to = to;
    }

    private Double to;

    BusCapacity(String typeOfCapacity, Double from, Double to) {
        if (typeOfCapacity == null || typeOfCapacity.isBlank()) {
            this.typeOfCapacity="Данные не заданы.";
        }else {
            this.typeOfCapacity=typeOfCapacity;
        }this.from=from;
        this.to=to;

    }
    public String getTypeOfCapacity() {
        return typeOfCapacity;
    }

}
