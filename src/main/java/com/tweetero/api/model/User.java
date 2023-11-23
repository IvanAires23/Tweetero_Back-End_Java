package com.tweetero.api.model;

import com.tweetero.api.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

    public User(UserDTO data) {
        this.avatar = data.avatar();
        this.username = data.username();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 245, nullable = false)
    private String username;

    @Column(length = 245, nullable = false)
    private String avatar;
}
