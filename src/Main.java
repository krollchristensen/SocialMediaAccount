public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Subject subject = new Subject();

        new ConcreteObserver(subject);
        new ConcreteObserver(subject);

        subject.setState(5);
        subject.setState(10);
    }
}