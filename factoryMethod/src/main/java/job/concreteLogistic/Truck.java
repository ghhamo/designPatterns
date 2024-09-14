package job.concreteLogistic;

import job.Logistic;

public class Truck extends Logistic {
    private final String licensePlate;
    private final String driverPhoneNumber;
    private final String driverName;

    public Truck(String licensePlate, String driverPhoneNumber, String driverName) {
        this.licensePlate = licensePlate;
        this.driverPhoneNumber = driverPhoneNumber;
        this.driverName = driverName;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    @Override
    public String getDriverName() {
        return driverName;
    }
}
