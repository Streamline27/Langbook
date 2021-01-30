package lv.forfun.tasks;

import lombok.RequiredArgsConstructor;
import lv.forfun.tasks.domain.Task;
import lv.forfun.tasks.domain.TaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TasksController {

    private final TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<Task> tasks() {
        return taskRepository.findAll();
    }
}
