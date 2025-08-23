package am240104.semana2.Dalvarez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

 @RestController
 @RequestMapping("/api/datos")
 public class Micontrolador {
    
    @Autowired
    private MiServicio miServicio;

    @GetMapping
    public List<String> obtenerDatos(){
        return miServicio.obtenerDatos();
    }

    @PostMapping
    public String agregarDato(@RequestBody String nuevoDato){
        miServicio.agregarDato(nuevoDato);
        return "Dato agregado correctamente: " + nuevoDato;
    }

    @PutMapping("/{indice}")
    public String actualizarDato(@PathVariable int indice, @RequestBody String datoActualizado) {
        boolean actualizado = miServicio.actualizarDato(indice, datoActualizado);
        if (actualizado) {
            return "Dato actualizado correctamente en índice " + indice;
        } else {
            return "Error: índice inválido " + indice;
        }
    }

    @DeleteMapping("/{indice}")
    public String eliminarDato(@PathVariable int indice) {
        boolean eliminado = miServicio.eliminarDato(indice);
        if (eliminado) {
            return "Dato eliminado correctamente en índice " + indice;
        } else {
            return "Error: índice inválido " + indice;
        }
    }


 }