
package com.portfolioBobadillaWanda.mgb.Interface;

import com.portfolioBobadillaWanda.mgb.Entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
    //traigo una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona
    
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo busco por id
    
    public void deletePersona(Long id);
    
    //buscar una persona por id
    
    public Persona findPersona(Long id);
    
}
