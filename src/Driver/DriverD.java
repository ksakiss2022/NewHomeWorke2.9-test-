package Driver;

import transport.Bus;
import transport.TrucksCar;

public class DriverD extends Driver<Bus> {

    public DriverD(String driverSFullName,
                Character thePresenceOfADriverSLicense,
        int experience,
        Bus transport) throws IllegalAccessException {
            super(driverSFullName, thePresenceOfADriverSLicense, experience, transport);
        }
    }


