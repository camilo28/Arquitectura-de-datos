
package Interfaz;

import Modelo.Patrocinador;
import java.util.List;


public interface CRUD_Patrocinador {
    public List listar();
    public Patrocinador list(int id);
    public boolean add(Patrocinador per);
    public boolean edit(Patrocinador per);
    public boolean eliminar(int id);
 
}
