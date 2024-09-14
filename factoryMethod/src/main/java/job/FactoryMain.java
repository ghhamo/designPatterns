package job;

import job.factory.LogisticFactory;

public class FactoryMain {

    public static void main(String[] args) {
        Logistic ship = LogisticFactory.getLogistic(Type.valueOf("SHIP"), "43ewq2", "054654543", "ship");
        Logistic truck = LogisticFactory.getLogistic(Type.valueOf("TRUCK"), "43ewq2", "054654543", "truck");
        Logistic plane = LogisticFactory.getLogistic(Type.valueOf("PLANE"), "43ewq2", "054654543", "plane");
        System.out.println(ship);
        System.out.println(truck);
        System.out.println(plane);
    }
}