package defaultPackage;

import java.util.*;
import java.io.*;

public class UsingFiles {

	public static void main(String[] args) throws FileNotFoundException
	{
		String fileName = "/home/alexis/Downloads/myfile.txt";
		System.out.println("Read a file line by line");
		PrintWriter out = new PrintWriter(fileName);
		out.println("A new line");
		out.println("A new line 2");
		out.close();
//		File f = new File("/home/alexis/Downloads/myfile.txt");
//		Scanner in = new Scanner(f);
		Scanner in = new Scanner(new File(fileName));
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			System.out.println(line);
		}

	}

}
