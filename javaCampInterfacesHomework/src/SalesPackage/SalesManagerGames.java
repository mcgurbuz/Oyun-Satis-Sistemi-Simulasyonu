package SalesPackage;

import GamerPackage.Gamer;

public class SalesManagerGames implements SalesManager{

	@Override
	public void add(Gamer gamer, Sales sales) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" satın aldı.");
		
	}
	
	//Overload metot kampanya oranı verince SalesManager altında Oyuncu oyunu indirimle alıyor
	public void add(Gamer gamer, Sales sales,double campaignRate) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getUserName()+" kullanıcısı "+"%"+campaignRate+" indirimle "+sales.name+" satın aldı.");
	}

	@Override
	public void update(Gamer gamer, Sales sales) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" güncelledi.");
	}

	@Override
	public void delete(Gamer gamer, Sales sales) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" sildi.");
	}

}
