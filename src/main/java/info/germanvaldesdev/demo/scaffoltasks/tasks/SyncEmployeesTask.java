package info.germanvaldesdev.demo.scaffoltasks.tasks;

public class SyncEmployeesTask extends Task {

    private int numberOfEmployeesProcessed = 100;

    public int getNumberOfEmployeesProcessed() {
        return numberOfEmployeesProcessed;
    }

    public void setNumberOfEmployeesProcessed(int numberOfEmployeesProcessed) {
        this.numberOfEmployeesProcessed = numberOfEmployeesProcessed;
    }
}
