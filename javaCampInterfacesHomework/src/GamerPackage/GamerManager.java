package GamerPackage;

import java.util.ArrayList;

import LoggerPackage.Logger;

public interface GamerManager {
	
	void addGamer(Gamer gamer);
	void updateGamer(Gamer gamer);
	void deleteGamer(Gamer gamer);
	void log(Gamer gamer,Logger logger,ArrayList<String> personalInformations);
	//Gamer gamer log icin...(eksik)
}
