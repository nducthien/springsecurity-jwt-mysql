package dev.springsecurityjwt.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_user")
@Getter
@Setter
public class User extends BaseEntity {

    @NotNull(message = "NotEmpty.appUserForm.userName")
    private String username;

    @NotNull(message = "NotEmpty.appUserForm.password")
    @Length(min = 3, message = "NotEmpty.appUserForm.password.length")
    private String password;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "t_user_role", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles = new HashSet<>();

}
