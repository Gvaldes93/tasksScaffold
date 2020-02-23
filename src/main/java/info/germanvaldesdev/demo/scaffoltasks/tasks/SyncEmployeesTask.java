package info.germanvaldesdev.demo.scaffoltasks.tasks;

public class SyncEmployeesTask extends Task<SyncEmployeesTask> {

    private int numberOfEmployessProcessed = 10;

    public int getNumberOfEmployessProcessed() {
        return numberOfEmployessProcessed;
    }

    public void setNumberOfEmployessProcessed(int numberOfEmployessProcessed) {
        this.numberOfEmployessProcessed = numberOfEmployessProcessed;
    }
}
