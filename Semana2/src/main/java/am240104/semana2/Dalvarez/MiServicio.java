package am240104.semana2.Dalvarez;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class MiServicio {

    private final List <String> datos = new ArrayList<>();

    public MiServicio() {
        //Datos iniciales
        datos.add("Elemento 1");
        datos.add("Elemento 2");
    }

    public List<String> obtenerDatos() {
        return datos;
    }

    public void agregarDato(String nuevoDato) {
        datos.add(nuevoDato);
    }

    public boolean actualizarDato(int indice, String datoActualizado) {
        if (indice >= 0 && indice < datos.size()) {
            datos.set(indice, datoActualizado);
            return true;
        } else {
            return false; // índice inválido
        }
    }

    public boolean eliminarDato(int indice) {
        if (indice >= 0 && indice < datos.size()) {
            datos.remove(indice);
            return true;
        } else {
            return false; // índice inválido
        }
    }
    
}