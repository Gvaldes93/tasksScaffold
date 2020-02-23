package info.germanvaldesdev.demo.scaffoltasks.tasks;

public class PayEmployeesTask extends Task<PayEmployeesTask> {

    void payEmployee(Object employee) {
        System.out.println("paid employee " + employee);
    }
}
