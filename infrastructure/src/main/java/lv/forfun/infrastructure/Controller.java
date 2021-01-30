package lv.forfun.infrastructure;

import lombok.RequiredArgsConstructor;
import lv.forfun.api.TasksApi;
import lv.forfun.api.UsersApi;
import lv.forfun.dto.TaskDto;
import lv.forfun.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final TasksApi tasksApi;
    private final UsersApi usersApi;

    @GetMapping("/users")
    public List<UserDto> users() {
        return usersApi.getUsers();
    }

    @GetMapping("/tasks")
    public List<TaskDto> tasks() {
        return tasksApi.getTasks();
    }
}
