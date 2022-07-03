package org.arthas.appmockito.ejemplos.repositories;

import org.arthas.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();

}
