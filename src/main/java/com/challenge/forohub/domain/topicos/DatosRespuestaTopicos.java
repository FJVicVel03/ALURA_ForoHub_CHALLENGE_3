package com.challenge.forohub.domain.topicos;

public record DatosRespuestaTopicos(
        Long id,
        String titulo,
        String mensaje,
        String fecha,
        Integer autor,
        String curso
) {
    public DatosRespuestaTopicos(Topicos topicos) {
        this(topicos.getId(), topicos.getTitulo(), topicos.getMensaje(), topicos.getFecha(), topicos.getAutor(), topicos.getCurso());
    }
}
