package com.zinibu.basic;

import java.util.*;
import java.io.*;

public class UsingFiles {

	public static void main(String[] args) throws FileNotFoundException, MyFileNotFoundException
	{
		String fileName = "/home/alexis/Downloads/myfile.txt";
//		String fileName = "/Users/alexis/test.txt";
		
//		System.out.println("Read a file line by line");
//		PrintWriter out = new PrintWriter(fileName);
//		out.println("A new line");
//		out.println("A new line 2");
//		out.close();
//		File f = new File("/home/alexis/Downloads/myfile.txt");
//		Scanner in = new Scanner(f);
//		File f = new File("/Users/alexis/test.txt");
		
		Scanner in = null;
		try {
			in = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			System.out.println(line);
		}
		
		doSomethingToFile("anything.txt");

	}
	
	public static void doSomethingToFile( String filename) throws MyFileNotFoundException {
		System.out.println("Doing something to file:" + filename);
	}

}
