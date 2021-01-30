package lv.forfun.api;

import lv.forfun.dto.UserDto;

import java.util.List;

public interface UsersApi {
    List<UserDto> getUsers();
}
