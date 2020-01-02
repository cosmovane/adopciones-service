package igf.g6.adopcionesservice.interfaces;

import igf.g6.adopcionesservice.models.Adopcion;
import org.springframework.data.repository.CrudRepository;

public interface AdopcionRepository extends CrudRepository<Adopcion, Long> {
}
