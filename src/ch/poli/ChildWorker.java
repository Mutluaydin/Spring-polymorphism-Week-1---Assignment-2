package ch.poli;

public class ChildWorker extends Worker {


    public ChildWorker() {
        super();

    }

    public void childWorker(int workingHours){

        if(workingHours <= 30){
            int weeklyCost = workingHours * 10;
            System.out.println(weeklyCost);
        }else{
            System.out.println("This worker can't work  longer than 30 Hours");
        }
    }


}
