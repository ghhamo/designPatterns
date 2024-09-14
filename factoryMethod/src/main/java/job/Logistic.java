package job;

public abstract class Logistic {
    public abstract String getLicensePlate();

    public abstract String getDriverPhoneNumber();

    public abstract String getDriverName();

    @Override
    public String toString() {
        return "License = " + this.getLicensePlate() + ", PNumber=" + this.getDriverPhoneNumber() + ", Name=" + this.getDriverName();
    }
}
