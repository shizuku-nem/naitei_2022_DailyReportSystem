package trainingManagementSystem.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import trainingManagementSystem.dao.impl.UserDAOImpl;
// TODO: import model

public abstract class GenericDAO<PK extends Serializable, T> extends HibernateDaoSupport {
	private static final Logger logger = LogManager.getLogger(UserDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public T findById(Serializable key) {
		return (T) getSession().get(getPersistentClass(), key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}

	public T saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
		logger.info(entity);
		return entity;
	}

	private Class<T> persistentClass;

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public GenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
