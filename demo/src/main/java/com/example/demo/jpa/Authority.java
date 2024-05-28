package com.example.demo.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(catalog = "application", name = "authorities")
@Data @NoArgsConstructor
public class Authority {
    @Id
    @Column(length = 64, nullable = false, unique = true)
    @NotBlank
    @Email
    private String email = null;

    @Column(nullable = false)
    private AuthoritiesSet grants = new AuthoritiesSet();

    public AuthoritiesSet getGrants() {
        return grants;
    }
}
