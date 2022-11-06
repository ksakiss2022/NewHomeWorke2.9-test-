package transport;

public enum CapacityTruck
{N1("с полной массой ",0.0,3.5),
    N2("с полной массой свыше ",3.5,12.0),
    N3("с полной массой свыше ",12.0,0.0);



    private final String typeOfLoadCapacity;
    private Double from;
    private Double to;

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

    CapacityTruck(String typeOfLoadCapacity, Double from, Double to){
        if (typeOfLoadCapacity == null || typeOfLoadCapacity.isBlank()) {
            this.typeOfLoadCapacity="Данные не заданы.";
        }else {
            this.typeOfLoadCapacity=typeOfLoadCapacity;
        }this.from=from;
        this.to=to;

    }
    public String getTypeOfLoadCapacity() {
        return typeOfLoadCapacity;
    }
}
