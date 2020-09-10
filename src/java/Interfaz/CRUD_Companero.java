
package Interfaz;

import Modelo.Companero;
import Modelo.Equipo;
import java.util.List;


public interface CRUD_Companero {
    public List listar();
    public Companero list(int id);
    public boolean add(Companero per);
    public boolean edit(Companero per);
    public boolean eliminar(int id);
 
}
