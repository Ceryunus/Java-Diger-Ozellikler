import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String fileLocation = "C:\\Users\\Ts\\Desktop\\java.txt";
		// creatFile(fileLocation);
		// getinfo(fileLocation);
		readFile(fileLocation);
		writeFile(fileLocation);
		readFile(fileLocation);

	}

	public static void getinfo(String fileLocation) {
		File file = new File(fileLocation);
		System.out.println("Dosya adi : " + file.getName());
		System.out.println("Dosya yolu : " + file.getAbsolutePath());
		System.out.println("Dosya yazilabilir mi : " + file.canWrite());
		System.out.println("Dosya okunabilir mi : " + file.canRead());
		System.out.println("Dosya boyutu  : " + file.length());

	}

	public static void creatFile(String fileLocation) {
		File file = new File(fileLocation);
		try {
			if (file.createNewFile()) {
				System.out.println("dosya oluþturuldu ... ");
			} else {
				System.out.println("dosya zaten var... ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readFile(String fileLocation) {
		File file = new File(fileLocation);
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);

			}
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void writeFile(String fileLocation) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileLocation, true)); // true olmaz ise yazar!
			bufferedWriter.newLine();
			bufferedWriter.write("Merhabalar");
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
