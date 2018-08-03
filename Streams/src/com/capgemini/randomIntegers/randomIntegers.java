package com.capgemini.randomIntegers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class randomIntegers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Generating random numbers between 1-49
		Random rand = new Random();
		
//Taking a empty array to store 100 numbers
		Integer[] arr = new Integer[100];
		int i = 0;

		BufferedWriter writer = null;
		File file = new File("P:\\Users\\ukarwasr\\Documents\\workspace-sts-3.9.5.RELEASE\\Streams\\src\\com\\capgemini\\randomIntegers\\boy.txt");

		try {
//using writer to write in sample.txt
			writer = new BufferedWriter(new FileWriter(file));

		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//storing random numbers in the array
		for (i = 0; i < 100; i++) 
		{
			arr[i] = rand.nextInt(49);
		}
//Writing the array to the file		
		for (i = 0; i < arr.length; i++) 
		{
			try 
			{
				//System.out.print(Integer.toString(arr[i]));
				writer.write((arr[i]) + "\r\n");
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//closing the file sample.txt
		writer.close();

// Reading random numbers from test.txt
		File file1 = new File("P:\\Users\\ukarwasr\\Documents\\workspace-sts-3.9.5.RELEASE\\Streams\\src\\com\\capgemini\\randomIntegers\\test.txt");
		Scanner scan = new Scanner(file1);
		int[] arr2 = new int[101];
		int j = 0;
		while (scan.hasNextInt())
		{
			arr2[j++] = scan.nextInt();
		}
		scan.close();

//Storing the integers extracted from test.txt in HashSet Collection
		Set<Integer> set = new TreeSet<>();

		for (j = 0; j < arr2.length; j++) {
			set.add(arr2[j]);
		}
		//Printing the set
		//hashset will remove the duplicates, sort the integers and then we are displaying it
		for (Integer integer : set) {
			System.out.println(integer);

		}

	}

}
