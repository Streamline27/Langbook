package lv.forfun.users.domain;

import lombok.Data;

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
}
