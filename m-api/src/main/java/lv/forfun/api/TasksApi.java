package lv.forfun.api;

import lv.forfun.dto.TaskDto;
import lv.forfun.dto.UserDto;

import java.util.List;

public interface TasksApi {
    List<TaskDto> getTasks();
}
