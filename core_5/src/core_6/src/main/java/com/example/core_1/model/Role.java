package com.example.core_1.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
    @Setter
    @Entity
    @Table(name="roles")
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = {"name"})
    public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
   @ManyToMany(mappedBy = "roles")

    private Set <user> users;

    }

