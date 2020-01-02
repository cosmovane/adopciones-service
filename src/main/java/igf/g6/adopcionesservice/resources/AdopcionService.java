package igf.g6.adopcionesservice.resources;

import igf.g6.adopcionesservice.interfaces.AdopcionRepository;
import igf.g6.adopcionesservice.models.Adopcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AdopcionService {

    @Autowired
    private AdopcionRepository adopcionRepository;


    public List<Adopcion> getAllAdopciones() {
        List<Adopcion> adopciones =
                new ArrayList<>();
        adopcionRepository.findAll().forEach(adopciones::add);
        return adopciones;

    }

    public Adopcion getAdopcion(String id) {
        return adopcionRepository.findById(Long.parseLong(id)).orElse(null);
    }

    public void addAdopcion(Adopcion adopcion) {
        adopcionRepository.save(adopcion);
    }

    public void updateAdopcion(Adopcion adopcion) {
        adopcionRepository.save(adopcion);
    }

    public void deleteAdopcion(String id) {
        adopcionRepository.deleteById(Long.parseLong(id));
    }
}
