package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2ListWhichStartWithGitValues {

	public static void main(String[] args) 
	{
		List<String> input = new ArrayList<String>();
		List<String> output = new ArrayList<String>();
		input = Arrays.asList("Git","GitHub","Gitlab","GitBash","Selenium","Java","Maven");
		System.out.println("Input :");
		System.out.println(input);
		System.out.println();
		
		for (int i=0; i<input.size();i++) 
		{
			
			if(input.get(i).contains("Git"))
			{
				 output.add(input.get(i));
			}
			else
				continue;
		}
		System.out.println("Output :");
		System.out.println(output);
		
	}

}
