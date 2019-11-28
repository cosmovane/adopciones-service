package igf.g6.resources;
import igf.g6.models.Adopcion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/adopciones")
public class AdopcionesResource {

    @RequestMapping("/{userId}")
    public List<Adopcion> getAdopciones(@PathVariable("userId") String userId){
        return Collections.singletonList(
                new Adopcion(1,2, new Date(2018,11,11), "Vanessa")
        );
    }
}
