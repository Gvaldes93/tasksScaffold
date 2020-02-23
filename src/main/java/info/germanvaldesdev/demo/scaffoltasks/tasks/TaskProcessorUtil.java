package info.germanvaldesdev.demo.scaffoltasks.tasks;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

@Component
public class TaskProcessorUtil implements ApplicationContextAware {

    private static ApplicationContext context;


    public static <T extends Object> T getTaskProcessorFor(Class clazz) {
        String[] beanNames = context.getBeanNamesForType(ResolvableType.forClassWithGenerics(TaskProcessor.class, clazz));
        if(beanNames.length > 1) {
            throw new RuntimeException("There should be only one Bean registered with name " + clazz.getName());
        }
        return (T) context.getBean(beanNames[0]);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        TaskProcessorUtil.context = context;
    }
}
