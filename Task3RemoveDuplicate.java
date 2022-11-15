package assignment4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task3RemoveDuplicate {

	public static void main(String[] args) 
	{
		List<String> input = new LinkedList<String>();
		List<String> output = new LinkedList<String>();
		input = Arrays.asList("Java","TestNG","Maven","Java");
		System.out.println("Input :");
		System.out.println(input);
		System.out.println();
		
		for (String str : input) 
		{
			if(!output.contains(str))
			{
				output.add(str);
			}
		}
		System.out.println("Output after removing duplicates :");
		System.out.println(output);
	}

}
