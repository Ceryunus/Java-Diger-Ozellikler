import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// arrray list icine istediðimiz kadar eleman koyabildiðimiz listelredir burdaki kullanýmda hem int hemde string koyulabilir
		ArrayList arrayList= new ArrayList();//tipsiz array
		arrayList.add(24);					 //diziye eleman eklemek 
		arrayList.add("sa");
		arrayList.add(2, "yunus");			 //belirli bir indexe eleman eklemek
		System.out.println(arrayList);		 //tüm diziyi yazdýrýr
		System.out.println(arrayList.size());//dizini boyutu 
		System.out.println(arrayList.get(2));//herhangi indezi yazdirmak
		
		
		for (Object object : arrayList) {	//foreach döngüsü ile tüm objeler sýrasýyla döndürmek
			System.out.println((arrayList.indexOf(object)+1)+". "+object);
		}
		//-----------------Tipi belli olan arraylistler 
		//bunlara tiplerinden baþka eleman konulmaz
		ArrayList<String> yaziarrayi = new ArrayList<String>();
		yaziarrayi.add("Yunus");
		yaziarrayi.add("Emre");
		yaziarrayi.add("Mersinli");
		
		for (String string : yaziarrayi) {
			System.out.println(string);
		}
		
		

	}

}
