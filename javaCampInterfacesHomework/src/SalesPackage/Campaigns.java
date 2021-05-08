package SalesPackage;

public class Campaigns extends Sales{
	double campaingRate;
	
	public Campaigns(String name,double campaignRate) {
		super(name);
		this.campaingRate=campaignRate;
	}

	public double getCampaingRate() {
		return campaingRate;
	}

	

}
