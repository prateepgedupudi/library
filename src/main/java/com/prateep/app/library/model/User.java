/**
 * 
 */
package com.prateep.app.library.model;

/**
 * @author prateep.gedupudi
 *
 */
public class User {
	private long id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private int maxBoooks;
	
 	
	
	/**
	 * 
	 */
	public User() {
		
	}
	/**
	 * @param id
	 * @param userName
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param maxBoooks
	 */
	public User(long id, String userName, String password, String firstName,
			String lastName, int maxBoooks) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.maxBoooks = maxBoooks;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the maxBoooks
	 */
	public int getMaxBoooks() {
		return maxBoooks;
	}
	/**
	 * @param maxBoooks the maxBoooks to set
	 */
	public void setMaxBoooks(int maxBoooks) {
		this.maxBoooks = maxBoooks;
	}
	

}
