package info.germanvaldesdev.demo.scaffoltasks.tasks;

public interface TaskProcessor<Task> {

    boolean processRequest(String request, Task task);

    boolean processResponse(String request, Task task);
}
