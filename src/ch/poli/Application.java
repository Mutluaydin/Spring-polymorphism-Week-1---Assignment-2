package ch.poli;

public class Application {
    public static void main(String[] args) {

        Employee worker1 = new DisabledWorker();
        Employee worker2 = new LazyWorker();
        Employee worker3 = new ChildWorker();
        Employee worker4 = new GoodWorker();


        worker1.disabledWorker(7);
        worker2.lazyWorker(4);
        worker3.childWorker(8);
        worker4.goodWorker(9);






    }
}
