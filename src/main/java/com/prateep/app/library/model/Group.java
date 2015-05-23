/**
 * 
 */
package com.prateep.app.library.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author prateep.gedupudi
 *
 */
@XmlRootElement
public class Group {
	private String groupName;
	private String groupDesc;
	private List<String> projects;
	public Group(){
		
	}
	/**
	 * @param groupName
	 * @param groupDesc
	 * @param projects
	 */
	public Group(String groupName, String groupDesc, List<String> projects) {
		super();
		this.groupName = groupName;
		this.groupDesc = groupDesc;
		this.projects = projects;
	}
	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @return the groupDesc
	 */
	public String getGroupDesc() {
		return groupDesc;
	}
	/**
	 * @param groupDesc the groupDesc to set
	 */
	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}
	/**
	 * @return the projects
	 */
	public List<String> getProjects() {
		return projects;
	}
	/**
	 * @param projects the projects to set
	 */
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Group [getGroupName()=" + getGroupName() + ", getGroupDesc()="
				+ getGroupDesc() + ", getProjects()=" + getProjects() + "]";
	}
	
	

}
