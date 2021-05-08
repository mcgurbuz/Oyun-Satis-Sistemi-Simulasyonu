package SalesPackage;

import GamerPackage.PremiumGamer;

public class SalesManagerCampaigns{

	//Salesmanagercampaing implement etmedi çünkü Gamer Gamer değil
	//Premiumgamer kullanıcısı istiyoruz.
	public void add(PremiumGamer premiumGamer, Sales sales) {
		
		System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" kampayasına katıldı.");
		
		}
		
	public void update(PremiumGamer premiumGamer, Sales sales) {
		System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" güncelledi.");
		
	}

	public void delete(PremiumGamer premiumGamer, Sales sales) {
		System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" sildi.");
		
	}

}
