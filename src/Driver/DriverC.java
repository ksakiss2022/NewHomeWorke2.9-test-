package Driver;

import transport.TrucksCar;

public class DriverC extends Driver<TrucksCar> {



    public DriverC(String driverSFullName,
                   Character thePresenceOfADriverSLicense,
                   int experience,
                   TrucksCar transport) throws IllegalAccessException {
        super(driverSFullName, 'C', experience, transport);

    }

}
