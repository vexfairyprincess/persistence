package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "students")
@Getter
@Setter
@ToString
public class Student {
    @Id
    private Long id;
    private String name;
    private String major;


}
