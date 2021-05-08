package GamerPackage;

import java.util.ArrayList;
import LoggerPackage.Logger;

public class FreeGamerManager implements GamerManager{

	@Override
	public void addGamer(Gamer gamer) {
		
		System.out.println("------------------------------FreeGamer EKLENİYOR-----------------");
		System.out.println(gamer.userName+" nickname eklendi.");
	}

	@Override
	public void updateGamer(Gamer gamer) {
		
		System.out.println(gamer.userName+" nickname güncellendi.");
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		
		System.out.println(gamer.userName+" nickname silindi.");
	}

	@Override
	public void log(Gamer gamer,Logger logger,ArrayList<String> personalInformations) {
		// TODO Auto-generated method stub
		logger.log(gamer, personalInformations);
	}

}
