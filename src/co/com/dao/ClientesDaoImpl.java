package co.com.dao;

import co.com.entities.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ClientesDaoImpl implements GenericDao<Cliente> {

    private static List<Cliente> db = new ArrayList<>();
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public List<Cliente> fetchAll() {
        return db;
    }

    @Override
    public void add(Cliente entity) {
        entity.setId((long) atomicInteger.incrementAndGet());
        db.add(entity);
    }

    @Override
    public void update(Cliente entity) {
        List<Cliente> newdb = db.stream().map(mapper -> mapper.getId().equals(entity.getId()) ? entity : mapper)
                .collect(Collectors.toList());
        db.clear();
        db.addAll(newdb);
    }

    @Override
    public void deleteById(Long id) {
        db.removeIf(m -> m.getId().equals(id));
    }

    @Override
    public Cliente findById(Long id) {
        return db.stream().filter(m -> m.getId().equals(id))
                .findFirst().orElse(null);
    }
}
