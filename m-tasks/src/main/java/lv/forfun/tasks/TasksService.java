package lv.forfun.tasks;

import lombok.RequiredArgsConstructor;
import lv.forfun.api.TasksApi;
import lv.forfun.api.UsersApi;
import lv.forfun.dto.TaskDto;
import lv.forfun.dto.UserDto;
import lv.forfun.tasks.domain.Task;
import lv.forfun.tasks.domain.TaskRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class TasksService implements TasksApi {

    private final UsersApi usersApi;
    private final TaskRepository taskRepository;

    @Override
    public List<TaskDto> getTasks() {
        Map<Long, UserDto> idToUser = usersApi.getUsers().stream()
                .collect(Collectors.toMap(UserDto::getId, it -> it));
        return taskRepository.findAll().stream()
                .map(toTaskDto(idToUser))
                .collect(Collectors.toList());
    }

    private Function<Task, TaskDto> toTaskDto(Map<Long, UserDto> idToUser) {
        return it -> it.toTaskDto(idToUser.get(it.getUserId()));
    }
}
