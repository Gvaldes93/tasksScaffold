package info.germanvaldesdev.demo.scaffoltasks.tasks;

public abstract class Task {

    private TaskProcessor<Task> taskProcessor;

    Task() {
        taskProcessor = TaskProcessorUtil.getTaskProcessorFor(getClass());
    }

    public void processRequest(String req) {
        taskProcessor.processRequest(req,  this);
    }

    public void processResponse(String resp) {
        taskProcessor.processResponse(resp, this);
    }
}
