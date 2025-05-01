package point.eight;

public class Usuario {
	private String userName;
	private String password;
	
	public Usuario(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Usuario [password=" + password + ", userName=" + userName + "]";
	}
}
