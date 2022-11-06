package HomeWorke2_7;

import Driver.DriverC;
import transport.BodyTypePassebgerCars;
import transport.PassengerCars;
import transport.TrucksCar;



public class Main {
    public static void main(String[] args)
    { boolean success=Date.valiDate("sveta",
            "sveta",
            "sveta");
        if (success){
            System.out.println("Данные верные.");
        }else {
            System.out.println("Данные не верны.");
        }
       // Date dateOne = new Date("0Zz_zzzzzzz", "sTT666110_s", "sTT666110_s");
       // checkPassworldLogin(dateOne);

//        TrucksCar trucksCar1 = new TrucksCar("BMW", "x5", 1.5f, 2022);
//        trucksCar1.diagnosticTransport();
//        PassengerCars passengerCars1 = new PassengerCars("kia", "rio", BodyTypePassebgerCars.PICKUP_TRUCK, 2022);
//        passengerCars1.diagnosticTransport();
//        DriverC driverC = new DriverC("Иванов Петр Петрович",null
//                ,24,
//                null);
    }

//    private static void checkPassworldLogin(Date dateOne) {
//    }
}
//    public DriverC(String driverSFullName,
//                   Character thePresenceOfADriverSLicense,
//                   int experience,
//                   TrucksCar transport) throws IllegalAccessException {
//        super(driverSFullName, thePresenceOfADriverSLicense, experience, transport);
//}
