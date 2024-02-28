package service;

import Dao.BD;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import model.Odontologo;
import service.OdontologoService;

import java.util.List;

public class OdontologoServiceTest {

    private OdontologoService odontologoService;



    @Test
    public void testListarTodos() {
        // Guardar algunos odontólogos para probar la lista
        Odontologo odontologo1 = new Odontologo(120, "Carlos", "Gutierrez");
        Odontologo odontologo2 = new Odontologo(121, "Laura", "Perez");

        OdontologoService odontologoService = new OdontologoService();
        odontologoService.guardar(odontologo1);
        odontologoService.guardar(odontologo2);

        // Listar todos los odontólogos y verificar
        List<Odontologo> odontologos = odontologoService.listarTodos();
        assertNotNull(odontologos);
        assertEquals(2, odontologos.size());

        // Puedes hacer más verificaciones según tu lógica de negocio
        assertEquals(120, odontologos.get(0).getNumeroMatricula());
        assertEquals("Carlos", odontologos.get(0).getNombre());
        assertEquals("Gutierrez", odontologos.get(0).getApellido());

        assertEquals(121, odontologos.get(1).getNumeroMatricula());
        assertEquals("Laura", odontologos.get(1).getNombre());
        assertEquals("Perez", odontologos.get(1).getApellido());
    }
}

