package GamerPackage;

import java.util.ArrayList;

import SalesPackage.Campaigns;
import SalesPackage.Games;

public class PremiumGamer extends Gamer{
	
	//Premium oyuncunun ekstra kampanyaları olacak...
	ArrayList<Campaigns> campaigns;
	
	public PremiumGamer(String userName, String password, String email, int level, double experience, ArrayList<Games> games,ArrayList<Campaigns> campaigns) {
		super(userName, password, email, level, experience, games);
		this.campaigns=campaigns;
	}

	public ArrayList<Campaigns> getCampaigns() {
		return campaigns;
	}

	

}
