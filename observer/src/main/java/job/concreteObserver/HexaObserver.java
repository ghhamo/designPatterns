package job.concreteObserver;

import job.Observer;
import job.Subject;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("hex = " + Integer.toHexString(this.subject.getState()));
    }
}
