package lv.forfun.users;

import lombok.RequiredArgsConstructor;
import lv.forfun.users.domain.User;
import lv.forfun.users.domain.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }
}
