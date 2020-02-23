package info.germanvaldesdev.demo.scaffoltasks.tasks;

public class SyncPayrollItemsTask extends Task {

    private String state = "Created";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
