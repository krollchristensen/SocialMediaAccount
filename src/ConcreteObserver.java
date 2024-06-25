public class ConcreteObserver extends Observer {
    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    public void update() {

        System.out.println("State changed to: " + subject.getState());
    }
}