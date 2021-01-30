package lv.forfun.users;

import lombok.RequiredArgsConstructor;
import lv.forfun.api.UsersApi;
import lv.forfun.dto.UserDto;
import lv.forfun.users.domain.User;
import lv.forfun.users.domain.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsersService implements UsersApi {

    private final UserRepository userRepository;

    public List<UserDto> getUsers() {
        return userRepository.findAll().stream()
                .map(User::toUserDto)
                .collect(Collectors.toList());
    }
}
