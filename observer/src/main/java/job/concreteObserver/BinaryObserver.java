package job.concreteObserver;

import job.Observer;
import job.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("binary = " + Integer.toBinaryString(this.subject.getState()));
    }
}
