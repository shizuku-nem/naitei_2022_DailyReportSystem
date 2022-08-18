package trainingManagementSystem.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import trainingManagementSystem.model.User;

@Component
public class UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	// save user
	@Transactional
	public void saveUser(User user) {
		hibernateTemplate.save(user);
	}

	// get all User
	public List<User> getAllUser() {
		return hibernateTemplate.loadAll(User.class);
	}

	// get user by id
	public User getById(Long id, Boolean isLock) {
		return hibernateTemplate.get(User.class, id);
	}

	// update user
	@Transactional
	public void updateUser(User user) {
		hibernateTemplate.update(user);
	}

	// delete user
	@Transactional
	public void deleteUser(Long id)

	{
		hibernateTemplate.delete(hibernateTemplate.get(User.class, id));
	}

}
