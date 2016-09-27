package smart.app.servlet;


public class User {
	
	private String userName;
	private int tvModel;
	public int[] idApps;

	public User(String userName, int tvModel, int[] idApps) {
		super();
		this.userName = userName;
		this.tvModel = tvModel;
		this.idApps = idApps;
	}
	
	
	public int[] getIdApps() {
		return idApps;
	}

	public void setIdApps(int[] idApps) {
		this.idApps = idApps;
	}

	public User(String userName, int tvModel) {
		super();
		this.userName = userName;
		this.tvModel = tvModel;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTvModel() {
		return tvModel;
	}
	public void setTvModel(int tvModel) {
		this.tvModel = tvModel;
	}
	
	
}
