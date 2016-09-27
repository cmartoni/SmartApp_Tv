package smart.app.servlet;

public class App {
	private int idApp;
	private String nameApp;
	private int sizeApp;
	private String descriptionApp;
	private String imgApp;
	private int installation;




	public App(int idApp, String nameApp, int sizeApp, String descriptionApp, String imgApp) {
		super();
		this.idApp = idApp;
		this.nameApp = nameApp;
		this.sizeApp = sizeApp;
		this.descriptionApp = descriptionApp;
		this.imgApp = imgApp;
	}
	
	
	
	
	public int getInstallation() {
		return installation;
	}
	public void setInstallation(int installation) {
		this.installation = installation;
	}
	public int getIdApp() {
		return idApp;
	}
	public void setIdApp(int idApp) {
		this.idApp = idApp;
	}
	public String getNameApp() {
		return nameApp;
	}
	public void setNameApp(String nameApp) {
		this.nameApp = nameApp;
	}
	public int getSizeApp() {
		return sizeApp;
	}
	public void setSizeApp(int sizeApp) {
		this.sizeApp = sizeApp;
	}
	public String getDescriptionApp() {
		return descriptionApp;
	}
	public void setDescriptionApp(String descriptionApp) {
		this.descriptionApp = descriptionApp;
	}
	public String getImgApp() {
		return imgApp;
	}
	public void setImgApp(String imgApp) {
		this.imgApp = imgApp;
	}
	
	
	
	
}
