package trainingManagementSystem.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hibernate.SessionFactory;

import trainingManagementSystem.dao.GenericDAO;
import trainingManagementSystem.dao.UserDAO;
import trainingManagementSystem.entity.User;

public class UserDAOImpl extends GenericDAO<Integer, User> implements UserDAO {
	private static final Logger logger = LogManager.getLogger(UserDAOImpl.class);

	public UserDAOImpl() {
		super(User.class);
	}

	public UserDAOImpl(SessionFactory sessionfactory) {
		setSessionFactory(sessionfactory);
	}
	
	@Override
	public User findByEmail(String email) {
		logger.info("email: " + email);
		return (User) getSession().createQuery("FROM User where email = ?").setParameter(0, email).getSingleResult();
	}

	@Override
	public List<User> searchUserUsingCretial(String name, int gender) {
		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<User> cr = builder.createQuery(User.class);
		Root<User> root = cr.from(User.class);
		cr.select(root);

		Predicate nameRestriction = builder.and(builder.like(root.get("name"), "%" + name + "%"));
		Predicate genderRestriction = builder.and(builder.equal(root.get("gender"), gender));

		cr.where(nameRestriction, genderRestriction);
		return getSession().createQuery(cr).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> loadUsers() {
		return getSession().createQuery("from User").getResultList();
	}

}
