package info.germanvaldesdev.demo.scaffoltasks.tasks;

import org.springframework.stereotype.Component;

@Component
public class SyncPayrollItemTaskProcessor implements TaskProcessor<SyncPayrollItemsTask> {

    @Override
    public boolean processRequest(String request, SyncPayrollItemsTask task) {
        System.out.println("processed task, state: " + task.getState());
        return false;
    }

    @Override
    public boolean processResponse(String request, SyncPayrollItemsTask clazz) {
        return false;
    }
}
