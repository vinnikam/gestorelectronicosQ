package edu.ucentral.aplicacion;

import edu.ucentral.dominio.Electronico;
import edu.ucentral.dominio.ElectronicoRepositorio;
import edu.ucentral.infraestructura.ElectronicoDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class ElectronicoServicio {
    @Inject
    ElectronicoRepositorio electronicoRepositorio;

    @Transactional
    public boolean guardar(ElectronicoDto electronicoDto){
        Electronico electronico = new Electronico();
        electronico.serial = electronicoDto.getSerial();
        electronico.marca = electronicoDto.getMarca();
        electronico.lote = electronicoDto.getLote();

        electronicoRepositorio.persist(electronico);
        return true;
    }
    public List<Electronico> consultarTodos() {
        return this.electronicoRepositorio.listAll();
    }

}
