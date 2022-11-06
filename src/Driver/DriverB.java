package Driver;

import transport.PassengerCars;

public class DriverB extends Driver<PassengerCars> {


    public DriverB(String driverSFullName,
                   Character thePresenceOfADriverSLicense,
                   int experience, PassengerCars transport) throws IllegalAccessException {
        super(driverSFullName, 'B', experience, transport);

    }
}
