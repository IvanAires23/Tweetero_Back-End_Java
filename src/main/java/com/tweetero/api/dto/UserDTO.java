package com.tweetero.api.dto;

import jakarta.validation.constraints.NotBlank;

public record UserDTO(
        @NotBlank String username,

        @NotBlank String avatar) {
}
