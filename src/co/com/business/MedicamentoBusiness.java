package co.com.business;

import co.com.dao.MedicamentosDaoImpl;
import co.com.entities.Medicamento;

import java.util.List;

public class MedicamentoBusiness {

    private MedicamentosDaoImpl medicamentosDao;

    public MedicamentoBusiness(){
        this.medicamentosDao = new MedicamentosDaoImpl();
    }

    public List<Medicamento> fetchAll(){
        return medicamentosDao.fetchAll();
    }

    public Medicamento getMedicamentoById(Long id){
        return medicamentosDao.findById(id);
    }

    public void addMedicamento(Medicamento medicamento){
        medicamentosDao.add(medicamento);
    }

    public void updateMedicamento(Medicamento medicamento){
        medicamentosDao.update(medicamento);
    }

    public void deleteMedicamento(Long id){
        medicamentosDao.deleteById(id);
    }
}
