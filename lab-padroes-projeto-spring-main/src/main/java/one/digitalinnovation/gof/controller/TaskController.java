package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Task;
import one.digitalinnovation.gof.service.TaskFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	private final TaskFacade taskFacade;

	@Autowired
	public TaskController(TaskFacade taskFacade) {
		this.taskFacade = taskFacade;
	}

	@GetMapping("/all")
	public List<Task> getAllTasks() {
		return taskFacade.getAllTasks();
	}

	@PostMapping("/create")
	public void createTask(@RequestBody Task task) {
		taskFacade.createTask(task);
	}
}