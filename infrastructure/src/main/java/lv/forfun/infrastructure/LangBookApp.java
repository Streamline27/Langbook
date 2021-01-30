package lv.forfun.infrastructure;

import lv.forfun.tasks.TasksModule;
import lv.forfun.users.UsersModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({
        TasksModule.class,
        UsersModule.class
})
@SpringBootApplication
public class LangBookApp {
    public static void main(String[] args) {
        SpringApplication.run(LangBookApp.class, args);
    }
}
