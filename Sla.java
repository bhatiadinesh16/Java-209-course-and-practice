package master.bot;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sla {
	
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		int num, temp;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("10.250.214.63", 1344);
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(num);
		
		temp = sc1.nextInt();
		System.out.println(temp);
		
		
		
		
	}

}
