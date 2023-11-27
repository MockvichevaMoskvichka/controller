package com.example.core_1.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"email"})
public class user {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private  String password;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name ="users_roles",
            JoinColumn = @JoinColumn(name ="user_id"),
        inverseJoinColumns = @JoinColumn(name="users_id"))
        private Set<Role> roles = new HashSet<>();
    public void  addRole(Role role) {
      roles.add(role);
        role.getUsers().add (this);
    }
    public void  removeRole( Role  role) {
      roles.remove (role);
        role.getUsers().remove(this);
    }

}
