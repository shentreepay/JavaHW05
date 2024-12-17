package hw5P35;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.FileWriter;

public class P35_5 {
	public static void main(String[] args) {
		try
		{
			FileWritter fw = new FileWritter("test.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye");
			
			pw.close();
			
			System.out.println("資料已經寫入檔案了");
		}
		catch(IOException e)
		{
			System.out.println("輸出入有誤");
		}
	}
}
