package ch.poli;

public class LazyWorker extends Worker {


    public LazyWorker() {
        super();
    }

    public void lazyWorker(int workingHours){
        if(workingHours <= 20){
            int weeklyCost = workingHours * 23;
            System.out.println(weeklyCost);
        }else{
            System.out.println("This worker can't work  longer than 20 Hours");
        }
    }


}
