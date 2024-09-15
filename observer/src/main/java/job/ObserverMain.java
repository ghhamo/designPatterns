package job;

import job.concreteObserver.BinaryObserver;
import job.concreteObserver.HexaObserver;
import job.concreteObserver.OctalObserver;

public class ObserverMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        HexaObserver hexaObserver = new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);
        subject.detach(hexaObserver);
        System.out.println();
        System.out.println();
        System.out.println();
        subject.setState(10);
    }
}