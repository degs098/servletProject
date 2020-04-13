package co.com.business;

import co.com.dao.ClientesDaoImpl;
import co.com.entities.Cliente;

import java.util.List;

public class ClienteBusiness {

    private ClientesDaoImpl clientesDao;

    public ClienteBusiness(){
        this.clientesDao = new ClientesDaoImpl();
    }

    public List<Cliente> fetchAll(){
        return clientesDao.fetchAll();
    }

    public Cliente getClienteById(Long id){
        return clientesDao.findById(id);
    }

    public void addCliente(Cliente cliente){
        clientesDao.add(cliente);
    }

    public void updateCliente(Cliente cliente){
        clientesDao.update(cliente);
    }

    public void deleteCliente(Long id){
        clientesDao.deleteById(id);
    }
}
