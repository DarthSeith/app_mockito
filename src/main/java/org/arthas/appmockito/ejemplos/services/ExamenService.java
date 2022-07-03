package org.arthas.appmockito.ejemplos.services;

import org.arthas.appmockito.ejemplos.models.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
