package defaultPackage;

import java.util.*;
import java.io.*;

public class UsingFiles {

	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Read a file line by line");
//		File f = new File("/home/alexis/Downloads/myfile.txt");
//		Scanner in = new Scanner(f);
		Scanner in = new Scanner(new File("/home/alexis/Downloads/myfile.txt"));
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			System.out.println(line);
		}

	}

}
