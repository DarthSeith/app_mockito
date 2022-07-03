package org.arthas.appmockito.ejemplos.services;

import org.arthas.appmockito.ejemplos.models.Examen;
import org.arthas.appmockito.ejemplos.repositories.ExamenRepository;

import java.util.Optional;

public class ExamenServiceImpl implements ExamenService {

    private ExamenRepository examenRepository;

    public ExamenServiceImpl(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    @Override
    public Examen findExamenPorNombre(String nombre) {
        Optional<Examen> optionalExamen = examenRepository.findAll().stream().
                filter(e -> e.getNombre().contains(nombre)).
                findFirst();

        Examen examen = null;
        if (optionalExamen.isPresent()) {
            examen = optionalExamen.orElseThrow();
        }
        return examen;
    }
}
