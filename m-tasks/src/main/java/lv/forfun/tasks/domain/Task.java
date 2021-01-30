package lv.forfun.tasks.domain;

import lombok.Data;
import lv.forfun.dto.TaskDto;
import lv.forfun.dto.UserDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    Long id;
    String name;
    String description;
    Long userId;

    public TaskDto toTaskDto(UserDto userDto) {
        return TaskDto.builder()
                .id(id)
                .description(description)
                .name(name)
                .user(userDto)
                .build();
    }
}
