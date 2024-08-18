package com.reference.architecture.entity.domain;

public record User(Long id, String name, String lastname, String email) {

    public User {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (lastname == null || lastname.isBlank()) {
            throw new IllegalArgumentException("Lastname cannot be null or blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
    }
}
