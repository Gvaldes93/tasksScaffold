package info.germanvaldesdev.demo.scaffoltasks;

import info.germanvaldesdev.demo.scaffoltasks.tasks.PayEmployeesTask;
import info.germanvaldesdev.demo.scaffoltasks.tasks.SyncEmployeesTask;
import info.germanvaldesdev.demo.scaffoltasks.tasks.SyncPayrollItemsTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        java.util.Arrays.asList(new SyncEmployeesTask(), new SyncPayrollItemsTask(), new PayEmployeesTask())
                .stream()
                .forEach(task -> task.processRequest("HEy"));
    }

}
