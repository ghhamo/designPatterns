package job.factory;

import job.Logistic;
import job.Type;
import job.concreteLogistic.Plane;
import job.concreteLogistic.Ship;
import job.concreteLogistic.Truck;

public class LogisticFactory {

    public static Logistic getLogistic(Type type, String license, String phoneNumber, String name) {
        if (type.equals(Type.TRUCK)) {
            return new Truck(license, phoneNumber, name);
        } else if (type.equals(Type.PLANE)) {
            return new Plane(license, phoneNumber, name);
        } else if (type.equals(Type.SHIP)) {
            return new Ship(license, phoneNumber, name);
        }
        return null;
    }
}
