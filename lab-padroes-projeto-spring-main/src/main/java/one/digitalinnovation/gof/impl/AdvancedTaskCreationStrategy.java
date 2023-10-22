package one.digitalinnovation.gof.impl;

import one.digitalinnovation.gof.model.Task;
import one.digitalinnovation.gof.repository.TaskRepository;
import one.digitalinnovation.gof.strategy.TaskCreationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvancedTaskCreationStrategy implements TaskCreationStrategy {

    private final TaskRepository taskRepository;

    @Autowired
    public AdvancedTaskCreationStrategy(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void createTask(Task task) {
        taskRepository.save(task);
    }
}