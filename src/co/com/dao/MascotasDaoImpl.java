package co.com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import co.com.entities.Mascota;

public class MascotasDaoImpl implements GenericDao<Mascota>{
	
	private static List<Mascota> db = new ArrayList<>();
	private static AtomicInteger atomicInteger = new AtomicInteger(0);

	@Override
	public List<Mascota> fetchAll() {		
		return db;
	}

	@Override
	public void add(Mascota entity) {
		entity.setId((long) atomicInteger.incrementAndGet());
		db.add(entity);
	}

	@Override
	public void update(Mascota entity) {
		List<Mascota> newdb = db.stream().map(mapper -> mapper.getId().equals(entity.getId()) ? entity : mapper)
				.collect(Collectors.toList());
		db.clear();
		db.addAll(newdb);
	}

	@Override
	public Mascota findById(Long id) {		
		return db.stream().filter(m -> m.getId().equals(id))
				.findFirst().orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		db.removeIf(m -> m.getId().equals(id));		
	}

}
