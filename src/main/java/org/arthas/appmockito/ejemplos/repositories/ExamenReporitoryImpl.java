package org.arthas.appmockito.ejemplos.repositories;

import org.arthas.appmockito.ejemplos.models.Examen;

import java.util.Arrays;
import java.util.List;

public class ExamenReporitoryImpl implements ExamenRepository {
    @Override
    public List<Examen> findAll() {
        return Arrays.asList(new Examen(5L, "Matematica"),
                new Examen(7L, "Historia"));
    }
}
