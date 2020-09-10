
package Interfaz;

import Modelo.Enemigo;
import java.util.List;


public interface CRUD_Enemigo {
    public List listar();
    public Enemigo list(int id);
    public boolean add(Enemigo per);
    public boolean edit(Enemigo per);
    public boolean eliminar(int id);
 
}
