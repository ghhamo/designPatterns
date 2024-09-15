package job.concreteObserver;

import job.Observer;
import job.Subject;

public class OctalObserver  extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("octal = " + Integer.toOctalString(this.subject.getState()));
    }
}
