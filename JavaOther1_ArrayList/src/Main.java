import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// arrray list icine istedi�imiz kadar eleman koyabildi�imiz listelredir burdaki kullan�mda hem int hemde string koyulabilir
		ArrayList arrayList= new ArrayList();//tipsiz array
		arrayList.add(24);					 //diziye eleman eklemek 
		arrayList.add("sa");
		arrayList.add(2, "yunus");			 //belirli bir indexe eleman eklemek
		System.out.println(arrayList);		 //t�m diziyi yazd�r�r
		System.out.println(arrayList.size());//dizini boyutu 
		System.out.println(arrayList.get(2));//herhangi indezi yazdirmak
		
		
		for (Object object : arrayList) {	//foreach d�ng�s� ile t�m objeler s�ras�yla d�nd�rmek
			System.out.println((arrayList.indexOf(object)+1)+". "+object);
		}
		//-----------------Tipi belli olan arraylistler 
		//bunlara tiplerinden ba�ka eleman konulmaz
		ArrayList<String> yaziarrayi = new ArrayList<String>();
		yaziarrayi.add("Yunus");
		yaziarrayi.add("Emre");
		yaziarrayi.add("Mersinli");
		
		for (String string : yaziarrayi) {
			System.out.println(string);
		}
		
		

	}

}
