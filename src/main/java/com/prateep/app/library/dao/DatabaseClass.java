/**
 * 
 */
package com.prateep.app.library.dao;

import java.util.HashMap;
import java.util.Map;

import com.prateep.app.library.model.User;

/**
 * @author prateep.gedupudi
 *
 */
public class DatabaseClass {
	private static Map<String, User> users = new HashMap<>();

	/**
	 * @return the users
	 */
	public static Map<String, User> getUsers() {
		return users;
	}

}
