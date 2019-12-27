package igf.g6.resources;
import igf.g6.models.Adopcion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
public class AdopcionesResource {

    @RequestMapping("/adopciones")
    public List<Adopcion> getAdopciones(){
        return Arrays.asList(
                new Adopcion(1, 2, "24/12/2019", "Vanessa")
        );
    }
}
