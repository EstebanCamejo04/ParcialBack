import Dao.BD;
import model.Odontologo;
import service.OdontologoService;

public class Main {
    public static void main(String[] args) {

        BD.crearTabla();

        Odontologo odontologo = new Odontologo(120,  "Ruben", "Machado");
        Odontologo odontologo2 = new Odontologo(121,  "Esteban", "Camejo");


        //creo una instancia de la clase para usar sus métodos
        OdontologoService odontologoService = new OdontologoService();

        odontologoService.guardar(odontologo);
        odontologoService.guardar(odontologo2);

        System.out.println("Este el " + odontologo + " este es el otro " + odontologo2);

        odontologoService.listarTodos();
    }

    }
