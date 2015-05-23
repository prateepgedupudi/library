/**
 * 
 */
package com.prateep.app.library.service;

import java.util.Map;

import com.prateep.app.library.dao.DatabaseClass;
import com.prateep.app.library.model.User;

/**
 * @author prateep.gedupudi
 *
 */
public class UserService {
	private Map<String, User> users = DatabaseClass.getUsers();
	
	public UserService(){
		users.put("prateep", new User(1, "prateep", "123456", "Prateep", "Gedupudi", 3));
		users.put("pradeep", new User(2, "pradeep", "123456", "Pradeep", "Gedupudi", 3));
	}
	
	public User getUser(String userName) {
		return users.get(userName);
	}
	
	public User addUser(User User) {
		User.setId(users.size() + 1);
		users.put(User.getUserName(), User);
		return User;
	}
	
	public User updateUser(User User) {
		if (User.getId() <= 0) {
			return null;
		}
		users.put(User.getUserName(), User);
		return User;
	}
	
	public User removeUser(long id) {
		return users.remove(id);
	}

}
