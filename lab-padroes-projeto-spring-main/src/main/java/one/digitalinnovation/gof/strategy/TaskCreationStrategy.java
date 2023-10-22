package one.digitalinnovation.gof.strategy;

import one.digitalinnovation.gof.model.Task;

public interface TaskCreationStrategy {
    void createTask(Task task);
}