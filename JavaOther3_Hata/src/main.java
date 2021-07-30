
public class main {
	public static void main(String[] args) {
		
		
		int[] sayilar = new int[] {1,5,4};
		
		
		try {
			System.out.println(sayilar[3]);
		} catch (Exception e) {
			System.out.println("bir hata oluþtu !        : "+e);
		}
		finally {
			System.out.println("hata olsun olmsýn her türlü çalýþacak ");
		}
		
		
	}
}
