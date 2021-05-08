package LoggerPackage;

import java.util.ArrayList;

import GamerPackage.Gamer;

public class EdevletLogger implements Logger{

	@Override
	public void log(Gamer gamer,ArrayList<String> personalInformations) {
		//ArayList sayesinde bilgileri burada yazdÄ±ralÄ±m.
		//Son noktada buraya ulasilacak buradaki bilgiler yazilacak.
		
		if(personalInformations.get(2).length() == 11 && !personalInformations.get(2).startsWith("0") ) {
			
			System.out.println(personalInformations+" bilgilerine sahip "+ gamer.getUserName()+" kullanıcısı loglandı...");
			
		}
		else if(personalInformations.get(2).startsWith("0"))
		{
			
			System.out.println("TCK Kimlik no 0 ile başlayamaz.");
		}
		else
		{
			System.out.println("TCK Kimlik no 11 haneli olmalıdır.");
		}
		
		
	}

}
