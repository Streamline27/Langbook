package lv.forfun.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TaskDto {
    Long id;
    String name;
    String description;
    UserDto user;
}
