package info.germanvaldesdev.demo.scaffoltasks.tasks;

import org.springframework.stereotype.Component;

@Component
public class SyncEmployeesTaskProcessor implements TaskProcessor<SyncEmployeesTask> {


    @Override
    public boolean processRequest(String request, SyncEmployeesTask task) {
        System.out.println("processed sync employees , total :" + task.getNumberOfEmployessProcessed());
        return false;
    }

    @Override
    public boolean processResponse(String request, SyncEmployeesTask task) {
        return false;
    }
}
