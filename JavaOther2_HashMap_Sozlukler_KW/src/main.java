import java.util.HashMap;

public class main {

	public static void main(String[] args) {

		HashMap<String, Integer> yas = new HashMap<String, Integer>();//s�zl�k olusturma 
		yas.put("Hasan", 25);//veri ekeme
		yas.put("Masan", 26);
		yas.put("Basan", 28);
		System.out.println(yas.get("Basan"));
		System.out.println(yas);
		
		yas.remove("Masan");//key verip silme
		
		for (String key : yas.keySet()) {//foreach ile key value yazd�rma
			
			System.out.println("isim : "+key+" 	Yas : "+yas.get(key));
			
		}
		
		yas.clear();//listeyi siler
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
