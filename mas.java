package master.bot;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class mas {
	
	public static void main(String args[]) throws IOException
	{
		int num,temp;
		ServerSocket s = new ServerSocket(1344);
		Socket ss = s.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		num = sc.nextInt();
				
		temp = num / 4;
		PrintStream p= new PrintStream(ss.getOutputStream());
		p.println(temp);
	}

}
