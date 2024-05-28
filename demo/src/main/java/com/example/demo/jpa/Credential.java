package com.example.demo.jpa;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(catalog = "application", name = "credentials")
@Data @NoArgsConstructor
public class Credential {
    @Id
    @Column(length = 64, nullable = false, unique = true)
    @NotBlank
    @Email
    private String email = null;

    @Lob
    @Column(nullable = false)
    @NotBlank
    private String password = null;

    public String getPassword() {
        return password;
    }
}
