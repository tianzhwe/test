package test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User2 {
	private String username; 
    private String realname; 
 
    @JsonProperty(value = "user_name")
    public void setUsername(String username) {
       this.username = username;
    }
}
