package ch.poli;

public class DisabledWorker extends Worker {


    public DisabledWorker() {
        super();
    }

    public void disabledWorker(int workingHours){
        if(workingHours <= 10){
            int weeklyCost = workingHours * 10;
            System.out.println(weeklyCost);
        }else{
            System.out.println("This worker can't work  longer than 10 Hours");
        }
    }

}
