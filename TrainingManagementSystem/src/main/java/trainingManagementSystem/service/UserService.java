package trainingManagementSystem.service;

import java.util.List;

import trainingManagementSystem.entity.User;

public interface UserService extends BaseService<Integer, User> {
	boolean deleteUser(Integer id);

	User findByEmail(String email);

	List<User> searchUsers(String name, int gender);

	List<User> loadUsers();
}
