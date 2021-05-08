package oopSoyutlamaOdev2;

import java.util.ArrayList;
import GamerPackage.FreeGamer;
import SalesPackage.Games;
import SalesPackage.SalesManagerCampaigns;
import GamerPackage.FreeGamerManager;
import GamerPackage.PremiumGamer;
import GamerPackage.PremiumGamerManager;
import LoggerPackage.EdevletLogger;
import SalesPackage.SalesManagerGames;
import SalesPackage.Campaigns;


public class Main {

	public static void main(String[] args) {
		
		//Oyun nesnelerini Games class kullanarak oluşturdum. İsim ve fiyat.
		Games GTA = new Games("GTA", 50);
		Games NeedForSpeed = new Games("NeedForSpeed", 100);
		Games CallofDuty = new Games("CallofDuty", 70);
		Games Sims = new Games("Sims", 100);
		
		//Games nesnesi isteyen bir ArrayList oluşturdum. İçinde çeşitli Games nesneleri mevcut.
		//FreeGamer ve PremiumGamer bu nesnelere sahip olmak istiyor.
		//FreeGamer ve PremiumGamerde constructorda Bu arraylisti istiyor.
		ArrayList<Games> race = new ArrayList<Games>();
		race.add(GTA);
		race.add(NeedForSpeed);
		race.add(Sims);
		
		//FreeGamer oluşturdum. race isimli bir Array istedi onu da burda verdim.
		FreeGamer deha = new FreeGamer("deha","12345","mmmcc@gmail.com",2,10,race);
		FreeGamerManager freeGamerManager = new FreeGamerManager();
		freeGamerManager.addGamer(deha);
		freeGamerManager.deleteGamer(deha);
		freeGamerManager.updateGamer(deha);
		
		ArrayList<String> personalInformationsDeha = new ArrayList<String>();
		personalInformationsDeha.add("Deha");
		personalInformationsDeha.add("GÜRBÜZ");
		personalInformationsDeha.add("14678389152");
		personalInformationsDeha.add("08.08.1997");
		//Loglama yapıldı. Edevlete loglama yaptım. Yarın dosyaya olursa onu yeni bir class eklerim
		//EdevletFile der geçerim.
		freeGamerManager.log(deha, new EdevletLogger(), personalInformationsDeha);
		
		SalesManagerGames salesManagerGames = new SalesManagerGames();
		
		salesManagerGames.add(deha, CallofDuty);
		salesManagerGames.delete(deha, CallofDuty);
		salesManagerGames.update(deha, CallofDuty);
		
		System.out.println("-----------------------------------------------------");
		
		Campaigns blackFriday = new Campaigns("Black Friday", 10);
		Campaigns summerTime = new Campaigns("SummerTime", 20);
		
		ArrayList<Campaigns> campaigns1 = new ArrayList<Campaigns>();
		campaigns1.add(blackFriday);
		campaigns1.add(summerTime);
		
		//Ek olarak Kampanya istiyor Premiumgamer ve onu Arraylist olarak verdik campaign
		PremiumGamer ecem = new PremiumGamer("Ecemdardar","123", "msadma@magö.com", 1, 10, race, campaigns1);
		PremiumGamerManager premiumgamerManager = new PremiumGamerManager();
		premiumgamerManager.addGamer(ecem);
		premiumgamerManager.deleteGamer(ecem);
		premiumgamerManager.updateGamer(ecem);
		
		ArrayList<String> personalInformationsEcem = new ArrayList<String>();
		personalInformationsEcem.add("ECEM");
		personalInformationsEcem.add("BAYRAKTAR");
		personalInformationsEcem.add("14678389152");
		personalInformationsEcem.add("00.00.1999");
		
		premiumgamerManager.log(ecem,new EdevletLogger(),personalInformationsEcem);
		
		SalesManagerCampaigns salesmanagerCampaign = new  SalesManagerCampaigns();
		salesmanagerCampaign.add(ecem, blackFriday);
		salesManagerGames.add(ecem,Sims ,campaigns1.get(0).getCampaingRate());
		salesManagerGames.delete(ecem, Sims); 
		salesManagerGames.update(ecem, Sims);
		
		
		
		
		
		
		

}
	
}

//Eklenecekler
//Oyuncunun oyunlarÄ±nÄ± gorelim

//Oyunu satÄ±n aldÄ±gÄ± zaman Silikon Valisi kullanÄ±cÄ±sÄ± Forza Horizon 4 satÄ±n aldÄ±.
//yazdÄ±rdÄ±gÄ±m yerde oyunu oyuncu almÄ±s olsun.
/*ArrayList<Games> games = new ArrayList<Games>();
games.add(Witcher3);
games.add(ForzaHorizon4);  bu kÄ±sÄ±mÄ± SalesManagerGames'de yapsak ???*/

//Silmeyi iade etme yap (?)
