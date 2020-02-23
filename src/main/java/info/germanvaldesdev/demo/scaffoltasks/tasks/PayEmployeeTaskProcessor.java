package info.germanvaldesdev.demo.scaffoltasks.tasks;

import org.springframework.stereotype.Component;

@Component
public class PayEmployeeTaskProcessor implements TaskProcessor<PayEmployeesTask> {

    @Override
    public boolean processRequest(String request, PayEmployeesTask task) {
        task.payEmployee(request);
        return true;
    }

    @Override
    public boolean processResponse(String request, PayEmployeesTask clazz) {
        return false;
    }
}
