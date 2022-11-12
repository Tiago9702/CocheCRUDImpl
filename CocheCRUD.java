package BOOTCAMP.Ejemplos;

import java.util.List;

public interface CocheCRUD {

    public void save (Coche atributos);

    List <Coche> findAll();

    public void delete (Coche atributos);

}
