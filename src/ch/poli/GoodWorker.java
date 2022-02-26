package ch.poli;

public class GoodWorker extends Worker{


    public GoodWorker() {
        super();
    }

    public void goodWorker(int workingHours){
        if(workingHours <= 40){
            int weeklyCost = workingHours * 40;
            System.out.println(weeklyCost);
        }else{
            System.out.println("This worker can't work  longer than 40 Hours");
        }
    }


}
