package Dao.implementacion;

import Dao.IDao;
import model.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoMemory implements IDao<Odontologo> {

private List <Odontologo> listarOdontologo = new ArrayList<>();


    @Override
    public Odontologo guardar(Odontologo odontologo) {
    listarOdontologo.add(odontologo);

    return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {

        return listarOdontologo;
    }
}
