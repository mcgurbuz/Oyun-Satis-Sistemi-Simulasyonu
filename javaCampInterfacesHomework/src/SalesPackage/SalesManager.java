package SalesPackage;

import GamerPackage.Gamer;

public interface SalesManager {
	
	void add(Gamer gamer,Sales sales);
	void update(Gamer gamer,Sales sales);
	void delete(Gamer gamer,Sales sales);

}
