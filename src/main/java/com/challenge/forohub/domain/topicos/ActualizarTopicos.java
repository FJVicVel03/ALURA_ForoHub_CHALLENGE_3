package com.challenge.forohub.domain.topicos;

import jakarta.validation.constraints.NotNull;

public record ActualizarTopicos(
        String titulo,
        String mensaje
) {
}
