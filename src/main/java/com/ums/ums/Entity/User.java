package com.ums.ums.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user_details")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name="user_name", unique = true, nullable = false)
    private String userName;

    @Column(name="name")
    private String name;

    @Column(name="email_id", unique = true, nullable = false)
    private String emailId;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    private String Role;
}
