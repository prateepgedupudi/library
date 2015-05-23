/**
 * 
 */
package com.prateep.app.library.resources.beans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author prateep.gedupudi
 *
 */
public class UserCredentials {
	@JsonProperty
    private String username;

    @JsonProperty
    private String password;


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
