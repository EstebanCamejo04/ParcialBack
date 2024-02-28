package service;

import Dao.IDao;
import Dao.implementacion.OdontologoDaoH2;
import Dao.implementacion.OdontologoDaoMemory;
import model.Odontologo;

import java.util.List;

public class OdontologoService {

    private IDao<Odontologo> IDao;

    public OdontologoService (){this.IDao = new OdontologoDaoH2();}
    //public OdontologoService (){this.IDao = new OdontologoDaoMemory();}

    public Odontologo guardar(Odontologo odontologo) {return IDao.guardar(odontologo);}
    public List<Odontologo> listarTodos() {return IDao.listarTodos(); }

}
