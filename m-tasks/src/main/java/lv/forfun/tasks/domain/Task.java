package lv.forfun.tasks.domain;

import lombok.Data;

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
}
