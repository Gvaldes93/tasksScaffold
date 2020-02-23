package info.germanvaldesdev.demo.scaffoltasks.tasks;

public abstract class Task<T> {

    private TaskProcessor<T> taskProcessor;

    Task() {
        taskProcessor = TaskProcessorUtil.getTaskProcessorFor(getClass());
    }

    public void processRequest(String req) {
        taskProcessor.processRequest(req, (T) this);
    }

    public void processResponse(String resp) {
    }
}
