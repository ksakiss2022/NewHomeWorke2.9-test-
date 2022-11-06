public class Flower {

    private String flowerColorName;
    //Цвет цветка (flowerColor);
    private String country;
    //Страна происхождения (country);
    private float cost;
    //Стоимость (cost);
    private int lifeSpan;
    //Срок стояния, указанный в целых днях (lifeSpan).

    Flower(String setflowerColorName, String setcountry, float setcost, int setlifeSpan) {

        this.flowerColorName = setflowerColorName;
        this.country = setcountry;
        this.cost = setcost;
        this.lifeSpan = setlifeSpan;
    }

    void printflower() {
        System.out.println("Название- " + flowerColorName + "," + " страной происхождения- " + country + "," + " стоимость- "
                + cost + ", " + "срок стояния цветка- " + lifeSpan);

    }

    public String getFlowerColorName() {
        return flowerColorName;
    }

    public void setFlowerColorName(String flowerColorName) {
        if (flowerColorName != null && !flowerColorName.isBlank() && !flowerColorName.isEmpty()) {
            this.flowerColorName = flowerColorName;
        } else {
            this.flowerColorName = "белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {

            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.00f;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = Math.abs(lifeSpan);
        }

    }
}