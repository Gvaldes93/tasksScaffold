package info.germanvaldesdev.demo.scaffoltasks.tasks;

public interface TaskProcessor<T> {

    boolean processRequest(String request, T task);

    boolean processResponse(String request, T task);
}
