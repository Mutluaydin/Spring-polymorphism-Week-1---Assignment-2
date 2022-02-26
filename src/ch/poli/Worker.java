package ch.poli;

public class Worker implements Employee{
    private int weeklyCost;
    private int workingHours;


    public Worker(int weeklyCost, int workingHours) {
        this.weeklyCost = weeklyCost;
        this.workingHours = workingHours;

    }

    public Worker() {

    }

    public void disabledWorker(int workingHours) {}

    public void lazyWorker(int workingHours) {}

    public void childWorker(int workingHours) {}

    public void goodWorker(int workingHours) {}




    public int getWeeklyCost() {
        return weeklyCost;
    }

    public void setWeeklyCost(int weeklyCost) {
        this.weeklyCost = weeklyCost;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }


}
