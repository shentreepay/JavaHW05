package hw5P40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.FileWriter;

public class P40_5 {
	public static void main(String[] args) {
		if(args.length != 1)
		{
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			
			while((str = br.readLine())!=null)
			{
				System.out.println("str");
			}
			
			br.close();
		}
		
		catch(IOException e)
		{
			System.out.println("輸出入有誤");
		}
	}
}
