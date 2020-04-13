package co.com.business;

import co.com.dao.MascotasDaoImpl;
import co.com.entities.Cliente;
import co.com.entities.Mascota;

import java.util.List;

public class MascotaBusiness {

    private MascotasDaoImpl mascotasDao;

    private ClienteBusiness clienteBusiness;

    public MascotaBusiness(){
        this.mascotasDao = new MascotasDaoImpl();
        this.clienteBusiness = new ClienteBusiness();
    }

    public List<Mascota> fetchAll(){
        return mascotasDao.fetchAll();
    }

    public void addMascota(Mascota mascota){
        Cliente propietario = clienteBusiness.getClienteById(mascota.getPropietario().getId());
        mascota.setPropietario(propietario);
        mascotasDao.add(mascota);
    }

    public void updateMascota(Mascota mascota){
        Cliente propietario = clienteBusiness.getClienteById(mascota.getPropietario().getId());
        mascota.setPropietario(propietario);
        mascotasDao.update(mascota);
    }

    public void deleteMascota(Long id){
        mascotasDao.deleteById(id);
    }

    public Mascota getMascotaById(Long id){
        return mascotasDao.findById(id);
    }
}
