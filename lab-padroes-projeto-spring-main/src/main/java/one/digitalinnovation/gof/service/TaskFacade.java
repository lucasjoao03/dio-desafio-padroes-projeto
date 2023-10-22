package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Task;
import one.digitalinnovation.gof.strategy.TaskCreationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskFacade {

    private final TaskService taskService;
    private final TaskCreationStrategy creationStrategy; // A estratégia de criação

    @Autowired
    public TaskFacade(TaskService taskService, TaskCreationStrategy creationStrategy) {
        this.taskService = taskService;
        this.creationStrategy = creationStrategy;
    }

    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    public void createTask(Task task) {
        creationStrategy.createTask(task);
    }
}