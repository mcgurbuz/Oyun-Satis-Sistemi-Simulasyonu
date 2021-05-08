package GamerPackage;

import java.util.ArrayList;

import SalesPackage.Games;

public class Gamer {
	
	String userName;
	String password;
	String email;
	int level;
	double experience;
	ArrayList<Games> games; 
	
	public Gamer(String userName, String password, String email, int level, double experience, ArrayList<Games> games) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.level = level;
		this.experience = experience;
		this.games = games;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public int getLevel() {
		return level;
	}

	public double getExperience() {
		return experience;
	}

	public ArrayList<Games> getGames() {
		return games;
	}
	
	

}
