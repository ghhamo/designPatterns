package job.concreteLogistic;

import job.Logistic;

public class Plane extends Logistic {

    private final String licensePlate;
    private final String driverPhoneNumber;
    private final String driverName;

    public Plane(String licensePlate, String driverPhoneNumber, String driverName) {
        this.licensePlate = licensePlate;
        this.driverPhoneNumber = driverPhoneNumber;
        this.driverName = driverName;
    }

    @Override
    public String getLicensePlate() {
       return this.licensePlate;
    }

    @Override
    public String getDriverPhoneNumber() {
        return this.driverPhoneNumber;
    }

    @Override
    public String getDriverName() {
        return this.driverName;
    }
}
