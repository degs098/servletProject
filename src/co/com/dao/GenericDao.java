package co.com.dao;

import java.util.List;

public interface GenericDao<T> {

	List<T> fetchAll();
	
	void add(T entity);
	
	void update(T entity);
	
	void deleteById(Long id);
	
	T findById(Long id);
}
