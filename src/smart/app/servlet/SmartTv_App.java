package smart.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class SmartTv_App
 */
@WebServlet(name = "SmartTv_App", urlPatterns = {"/SmartTv_App"})
public class SmartTv_App extends HttpServlet {

	private static final long serialVersionUID = -942837111142444825L;
	
	public User user1;
	public User user2;
	public User user3;
	App[] userAppLists;
	
	
	
	
	
	public SmartTv_App() {
        super();
        
    }
    
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		userInit();
		User currentUser = user1;
		App[] currentAppList = getAppList(currentUser);
		for (int i = 0; i < currentAppList.length; i++) {
			if (currentUser.idApps[i]==1) {
				currentAppList[i].setInstallation(1);
			}
			
		}
		request.setAttribute("username", currentUser.getUserName());
		request.setAttribute("tvModel", currentUser.getTvModel());
		request.setAttribute("appList", currentAppList);
		
		
		try{			
			request.getRequestDispatcher("SmartTv_App.jsp").forward(request, response);
			System.out.println("Success");
		}catch (Exception e) {
			System.out.println("Error");
		}
		
		
	}
	
  	
  	
  	protected void userInit(){
  		int[] idApps1 = {0,0,0,0,0,0,0,0,0};
  		user1 = new User("Bruno", 1, idApps1);
  		
  		int[] idApps2 = {1,0,1,0,1,0,0,0,0};
  		user2 = new User("Henriquie", 2, idApps2);
  		
  		int[] idApps3 = {0,1,1,1,1,1,1,1,1};
  		user2 = new User("Caio", 3, idApps3);
  		
  	}
  	
	
	protected App[] getAppList(User user){
    	

    	switch (user.getTvModel()) {
			case 1:
				userAppLists = new App[3];
				userAppLists[0] = new App(1, "Netflix", 5, "Netflix para sua SmartTv!", "netflix.png");
				userAppLists[1] = new App(2, "Gmail", 5, "Gmail para sua SmartTv!", "gmail.png");
		    	userAppLists[2] = new App(3, "Facebook", 5, "Facebook para sua SmartTv!", "facebook.png");
				break;
			case 2:
				userAppLists = new App[6];
		    	userAppLists[0] = new App(1, "Netflix", 5, "Netflix para sua SmartTv!", "netflix.png");
		    	userAppLists[1] = new App(2, "Gmail", 5, "Gmail para sua SmartTv!", "gmail.png");
		    	userAppLists[2] = new App(3, "Facebook", 5, "Facebook para sua SmartTv!", "facebook.png");
		    	userAppLists[3] = new App(4, "Skype", 6, "Skype para sua SmartTv!", "skype.png");
		    	userAppLists[4] = new App(5, "Spotify", 6, "Spotify para sua SmartTv!", "spotify.png");
		    	userAppLists[5] = new App(6, "Twitch", 6, "Twitch para sua SmartTv!", "twitch.png");
				break;
			case 3:
				userAppLists = new App[9];
				userAppLists[0] = new App(1, "Netflix", 5, "Netflix para sua SmartTv!", "netflix.png");
		    	userAppLists[1] = new App(2, "Gmail", 5, "Gmail para sua SmartTv!", "gmail.png");
		    	userAppLists[2] = new App(3, "Facebook", 5, "Facebook para sua SmartTv!", "facebook.png");
		    	userAppLists[3] = new App(4, "Skype", 6, "Skype para sua SmartTv!", "skype.png");
		    	userAppLists[4] = new App(5, "Spotify", 6, "Spotify para sua SmartTv!", "spotify.png");
		    	userAppLists[5] = new App(6, "Twitch", 6, "Twitch para sua SmartTv!", "twitch.png");
		    	userAppLists[6] = new App(7, "Twitter", 7, "Twitter para sua SmartTv!", "twitter.png");
		    	userAppLists[7] = new App(8, "Youtube", 7, "Youtube para sua SmartTv!", "youtube.png");
		    	userAppLists[8] = new App(9, "Youtube Gaming", 7, "Youtube Gaming para sua SmartTv!", "youtubegaming.png");
				break;
	
			default:
				break;
		}
    	return userAppLists;
    }
	
}

