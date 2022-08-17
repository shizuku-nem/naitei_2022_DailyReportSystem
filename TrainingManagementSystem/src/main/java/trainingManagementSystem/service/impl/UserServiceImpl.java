package trainingManagementSystem.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.LogManager;

import trainingManagementSystem.dao.impl.UserDAOImpl;
import trainingManagementSystem.entity.User;
import trainingManagementSystem.service.UserService;

@Component
public class UserServiceImpl extends BaseServiceImpl implements UserService {
	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public User saveOrUpdate(User entity) {
		try {
			return getUserDAO().saveOrUpdate(entity);
		} catch (Exception e) {
			logger.error(e);
			throw e;
		}
	}

	@Override
	public boolean deleteUser(Integer id) {
		try {
			User user = getUserDAO().findById(id);
			return delete(user);
		} catch (Exception e) {
			logger.error(e);
			throw e;
		}
	}

	@Override
	public User findByEmail(String email) {
		try {
			return getUserDAO().findByEmail(email);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<User> searchUsers(String name, int gender) {
		try {
			return getUserDAO().searchUserUsingCretial(name, gender);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<User> loadUsers() {
		try {
			return getUserDAO().loadUsers();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public User findById(Serializable key) {
		try {
			return getUserDAO().findById(key);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean delete(User entity) {
		try {
			getUserDAO().delete(entity);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

}
