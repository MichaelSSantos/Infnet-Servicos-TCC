package infnet.servicosrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public abstract class JpaDao<T> implements Dao<T> {

	@PersistenceContext
	protected EntityManager em;
	private Class<T> clazz;

	public final void setClazz(Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	@Override
	public void salvar(T entity) {
		em.persist(entity);
	}

	@Override
	public void atualizar(T entity) {
		em.merge(entity);
	}

	@Override
	public T buscar(Integer id) {
		return (T) em.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return em.createQuery("from " + clazz.getName()).getResultList();
	}

	@Override
	public void excluir(T entity) {
		em.remove(entity);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
