package blog.model;

import javax.persistence.*;

@Entity
public class User
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
	private String Email;
	private String Username;
	private String Password;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
}
