package ir.example.springbootcms.entity;

import ir.example.springbootcms.base.entity.BaseEntity;
import ir.example.springbootcms.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Inheritance
public class User extends BaseEntity<Long> {

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
