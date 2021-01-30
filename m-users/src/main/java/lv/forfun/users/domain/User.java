package lv.forfun.users.domain;

import lombok.Data;
import lv.forfun.dto.UserDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    Long id;
    String name;
    String surname;

    public static UserDto toUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .build();
    }
}
