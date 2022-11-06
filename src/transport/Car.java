package transport;

import HomeWorke2_7.PassDiagnosticsException;

import java.time.LocalDate;

public class Car extends Transport {
    public String numberAuto;
    public float engineVolume;
    public String transmission;
    //Коробка передач
    public String bodyType;
    // Тип кузова
    public String registrationNumber;
    //Регистрационный номер
    public int numberOfSeats;
    // Количество мест
    public boolean winterTires;
    //sign "Summer" or "Winter tires" признак «Летняя» или «Зимняя резина»
    private Key key;

    private Insurance insurance;

    public Car(String brand, String model) {
        super(brand, model);
    }

    public Car(String brand, String model, float engineCapacity) {
        super(brand, model, engineCapacity);
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

    public Car(String brand, String model, int productionYear, String productionCountry, String color, int movementSpeed) {
        super(brand, model, productionYear, productionCountry, color, movementSpeed);

    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках," +
                " если это электрокар.");
    }

    public static class Insurance {

        private LocalDate insuranceValidityPeriod;

        //Срок действия страховки
        private double theCostOfInsurance;
        //Стоимость страховки
        private String insuranceNumber;


        public Insurance(LocalDate setInsuranceValidityPeriod, double theCostOfInsurance, String insuranceNumber) {
            this.insuranceValidityPeriod = setInsuranceValidityPeriod;

            if (insuranceNumber.length() > 9) {
                System.out.println("Номер страховки не правильный");
            }
            this.theCostOfInsurance = theCostOfInsurance;
            this.insuranceNumber = insuranceNumber;
        }

        public double getTheCostOfInsurance() {
            return theCostOfInsurance;
        }

        public void setTheCostOfInsurance(double theCostOfInsurance) {
            this.theCostOfInsurance = theCostOfInsurance;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
        }

        public LocalDate getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }

        public void setInsuranceValidityPeriod(LocalDate insuranceValidityPeriod) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
            if (insuranceValidityPeriod.isBefore(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");

            }
        }
    }

    public static class Key {

        private boolean remoteEngineStart;
        //Удаленный запуск двигателя
        private boolean keylessAccess;
        //Бесключевой доступ

        public Key(boolean setRemoteEngineStart, boolean setKeylessAccess) {
            this.remoteEngineStart = setRemoteEngineStart;
            this.keylessAccess = setKeylessAccess;
        }

        //Бесключевой доступ
        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
            if (remoteEngineStart == true) {
                this.remoteEngineStart = remoteEngineStart;
            } else {
                System.out.println("нет бесключевого доступа");
            }

        }


        public boolean getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
            if (keylessAccess == true) {
                this.keylessAccess = keylessAccess;
            } else {
                System.out.println("нет автозапуска");
            }
        }

    }


    public void car() {
        System.out.print(getBrand() + " ");
        System.out.print(getModel() + ", ");
        System.out.print(productionYear + " год выпуска, ");
        System.out.print("сборка " + productionCountry + ", ");
        System.out.print("цвет кузова " + color+ ", ");
        System.out.print("объем двигателя " + engineVolume + " литра");
        System.out.println();
    }

    public void allCar() {
        System.out.print(getBrand() + " ");
        System.out.print(getModel() + ", ");
        System.out.print(productionYear + " год выпуска, ");
        System.out.print("сборка " + productionCountry + ", ");
        System.out.print("цвет кузова " + color + ", ");
        System.out.println("объем двигателя " + engineVolume + " литра, ");
        System.out.print("коробка передач " + transmission + " ,");
        System.out.print("тип кузова " + bodyType + " ,");
        System.out.print("регистрационный номер " + registrationNumber + " ,");
        System.out.print("роличество мест " + numberOfSeats + " ,");
        System.out.println("резина " + winterTires + " ");
        System.out.println();
    }


    public boolean chekNumberCar() {
        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}]")) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Регистрационный знак не верный";
        }
        if (this.registrationNumber.length() < 9) {
//            throw new RuntimeException("Количество цифр в номере не верно");
            System.out.println("Количество символов в номере не верно");
            return false;
        }
        char[] number = this.registrationNumber.toCharArray();
        if (!Character.isAlphabetic(number[0])) {
            System.out.println("Не верные символы в номере");
//    throw new RuntimeException("Не верные символы в номере");
            return false;
        }

        if (!Character.isAlphabetic(number[4])) {
            System.out.println("Не верный 5-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isAlphabetic(number[5])) {
            System.out.println("Не верный 6-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[1])) {
            System.out.println("Не верный 2-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[2])) {
            System.out.println("Не верный 3-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[3])) {
            System.out.println("Не верный 4-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[6])) {
            System.out.println("Не верный 7-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[7])) {
            System.out.println("Не верный 8-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        if (!Character.isDefined(number[8])) {
            System.out.println("Не верный 9-й символ в номере");
//            throw new RuntimeException("Не верные символы в номере");
            return false;
        }
        return true;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            this.insurance = insurance;
        }
        this.insurance = insurance;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = key;
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }


    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(String numberAuto) {
        this.numberAuto = numberAuto;
    }

    public boolean isWinterTires() {
        return winterTires;
    }



    int yearDiagnostic;
    public Car(String brand, String model, int yearDiagnostic) {
        super(brand, model);
        this.yearDiagnostic = yearDiagnostic;
    }

    public int getYearDiagnostic() {
        return yearDiagnostic;
    }

    public static boolean checkDiagnostic(Car car) throws PassDiagnosticsException{

        if (car.yearDiagnostic >= 2020 && car.yearDiagnostic <= 2022){
            System.out.println("Диагностику проходить не нужно.");
        }else {
            throw new PassDiagnosticsException("Необходимо пройти диагностику.");
        }
        return false;
    }
    @Override
    public void service() {
        System.out.println("Машина - "+ getBrand()+", "+getModel()+" прошла техническое обслуживаение.");
    }
    @Override
    public void repair() {
        System.out.println(getBrand()+", "+getModel()+" требует ремонта.");
    }

}

