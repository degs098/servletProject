package co.com.dao;

import co.com.entities.Medicamento;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MedicamentosDaoImpl implements GenericDao<Medicamento>{

	private static List<Medicamento> db = new ArrayList<>();
	private static AtomicInteger atomicInteger = new AtomicInteger(0);
	
	@Override
	public List<Medicamento> fetchAll() {
		return db;
	}

	@Override
	public void add(Medicamento entity) {
		entity.setId((long) atomicInteger.incrementAndGet());
		db.add(entity);
	}

	@Override
	public void update(Medicamento entity) {
		Medicamento existingValue = findById(entity.getId());
		List<Medicamento> newdb = db.stream().map(mapper -> mapper.getId().equals(entity.getId()) ? entity : mapper)
				.collect(Collectors.toList());
		db.clear();
		db.addAll(newdb);
	}

	@Override
	public void deleteById(Long id) {
		db.removeIf(m -> m.getId().equals(id));
	}

	@Override
	public Medicamento findById(Long id) {
		return db.stream().filter(m -> m.getId().equals(id))
				.findFirst().orElse(null);
	}

}
